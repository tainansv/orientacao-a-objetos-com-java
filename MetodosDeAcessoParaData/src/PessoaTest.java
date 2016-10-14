import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class PessoaTest {

	Pessoa p1 = new Pessoa();	
	Pessoa p2 = new Pessoa();
	Pessoa p3 = new Pessoa();
	
	
	@Before
	public void inicializa(){
		p1.setDataDeNascimento(4, 5, 1992);
		p2.setDataDeNascimento(9, 6, 2003);
		p3.setDataDeNascimento(29, 7, 1994);
	}
	
	@Test
	public void testePessoa() {
		
		assertEquals(24, p1.getIdade());
		assertEquals("Touro", p1.getSigno());
		
		assertEquals(13, p2.getIdade());
		assertEquals("Gêmeos", p2.getSigno());
		
		assertEquals(22, p3.getIdade());
		assertEquals("Leão", p3.getSigno());
	}

}
