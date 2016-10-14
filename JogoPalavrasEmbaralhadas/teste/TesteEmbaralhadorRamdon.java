import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteEmbaralhadorRamdon {

	Embaralhador embaralhador;
	
	@Before
	public void inicializa() {
		embaralhador = new EmbaralharRamdon();
	}
	
	@Test
	public void testeEmbaralhadorRandom() {
		
		String palavra = "palavra";
		
		char[] c = palavra.toCharArray();
		
		String palavraEmbaralhada = embaralhador.embaralhar(palavra);
		
		equals(palavraEmbaralhada.contains(palavra));
	}
}
