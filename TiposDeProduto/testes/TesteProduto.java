import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {

	Produto p1;
	Produto p2;
	Produto p3;
	
	@Before
	public void inicializaProdutos() {
		
		p1 = new Produto("p1", 1, 1.7);
		p2 = new Produto("p2", 2, 2.2);
		p3 = new Produto("p3", 1, 2.4);

	}

	
	
	@Test
	public void testeEquals() {
		
		assertFalse(p1.equals(p2));
		assertTrue(p1.equals(p3));
	}

	
	@Test
	public void testeHashCode() {
		
		assertTrue(p1.hashCode() != p2.hashCode());
		assertTrue(p1.hashCode() == p3.hashCode());
	}
}
