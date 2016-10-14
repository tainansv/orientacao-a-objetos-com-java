import static org.junit.Assert.*;

import org.junit.Test;

public class TesteAutoridade {

	Autoridade p1 = new Autoridade("José", "Maria");
	Autoridade p2 = new Autoridade("Maria", "José");
	
	@Test
	public void testeInformal() {
		
		assertEquals("José", p1.getTratamento("informal", null));
		assertEquals("Maria", p2.getTratamento("informal", null));
	}
	
	@Test
	public void testeRespeitoso() {
		
		assertEquals("Sr. Maria", p1.getTratamento("respeitoso", "m"));
		assertEquals("Sra. José", p2.getTratamento("respeitoso", "f"));
	}
	
	@Test
	public void testeComTitulo() {
		
		assertEquals("Vossa Alteza José Maria", p1.getTratamento("com titulo", "Vossa Alteza"));
		assertEquals("Vossa Majestade Maria José", p2.getTratamento("com titulo", "Vossa Majestade"));
	}
}
