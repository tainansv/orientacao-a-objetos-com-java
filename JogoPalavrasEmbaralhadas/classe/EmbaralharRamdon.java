import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralharRamdon implements Embaralhador {

	//Embaralha a palavra mudando as letras de posição aleatoriamente
	@Override
	public String embaralhar(String palavra) {
		List<String> letras = Arrays.asList(palavra.split(""));
		Collections.shuffle(letras);
		StringBuilder novaPalavra = new StringBuilder();
		for(String k : letras) {
			novaPalavra.append(k);
		}
		return novaPalavra.toString();
	}

}
