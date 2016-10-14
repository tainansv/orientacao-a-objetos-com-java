import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteEmbaralhadorInverter {

	Embaralhador embaralhador;
	
	@Before
	public void inicializa() {
		embaralhador = new EmbaralharInverter();
	}
	
	@Test
	public void testeEmbaralhadorRandom() {
		
		String palavra = "palavra";
		
		char[] c = palavra.toCharArray();
		
		String palavraEmbaralhada = embaralhador.embaralhar(palavra);
		
		equals(palavraEmbaralhada.contains(palavra));
		
	}

}
