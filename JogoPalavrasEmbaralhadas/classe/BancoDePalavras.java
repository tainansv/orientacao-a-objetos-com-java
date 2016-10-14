import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BancoDePalavras {
	
	private File arquivo = new File("palavras.txt");
	
	public String getPalavra() throws IOException {
		return sortearPalavra();
	}
	
	private String sortearPalavra() throws IOException {
		String palavra;
		List<String> palavras = new ArrayList<>();
		
		FileReader fileReader = new FileReader(arquivo);
		BufferedReader reader = new BufferedReader(fileReader);
		String linha = reader.readLine();
		
		while (linha != null) {
			palavras.add(linha);
			linha = reader.readLine();
		}
		reader.close();
		
		Collections.shuffle(palavras);
		palavra = palavras.get(0);
		
		return palavra;
	}
}
