import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	public static Map<String,String> processar(String nomeArquivo){
		File file = new File(nomeArquivo);
		
		if (!file.exists())
			throw new LeituraArquivoException("Arquivo inexistente");
		Map<String,String> map = new HashMap<String,String>();
		Scanner scanner;
		try{
			scanner = new Scanner(file);
			try{
				if (!scanner.hasNextLine())
					throw new LeituraArquivoException("Arquivo vazio");
				while (scanner.hasNextLine()){
					String strLine = scanner.nextLine();
					String[] strPairValue = strLine.split("->");
					if (strPairValue.length != 2)
						throw new LeituraArquivoException("Formato de arquivo inválido");
					map.put(strPairValue[0], strPairValue[1]);
				}
				return map;
			} 
			finally{ scanner.close(); }
		}
		catch(FileNotFoundException e){ throw new LeituraArquivoException("Erro ao abrir o arquivo: " + e.getMessage()); }
		catch(RuntimeException e){ throw new LeituraArquivoException(e.getMessage()); }
	}

}
