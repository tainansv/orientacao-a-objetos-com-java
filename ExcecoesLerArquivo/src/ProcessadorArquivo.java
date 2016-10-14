import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	public static Map<String, String> processar(File file) throws Exception {
		
		Scanner scanner;
		Map<String, String> mapa = new HashMap<>();
		
		try {
			scanner = new Scanner(file);
				
			if(!scanner.hasNextLine()) {
				scanner.close();
				throw new LeituraArquivoException("Arquivo vazio");
			}
		
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				
				if (linha.contains("->") && linha.indexOf("->") == linha.lastIndexOf("->")) {
					String[] lista = linha.split("->");
					mapa.put(lista[0], lista[1]);
				}else {
					scanner.close();
					throw new LeituraArquivoException("Formato invalido");
				}
			}
		scanner.close();
		return mapa;
		} catch (IOException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo "+e.getMessage());
		}
	}
}
