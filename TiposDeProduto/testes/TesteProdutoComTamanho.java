import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	Produto p1;
	Produto p2;
	Produto p3;
	Produto p4;
	
	@Before
	public void inicializaProdutos() {
		
		p1 = new ProdutoComTamanho("p1", 1, 1.7, 2);
		p2 = new ProdutoComTamanho("p2", 2, 2.2, 2);
		p3 = new ProdutoComTamanho("p3", 1, 2.4, 3);
		p4 = new ProdutoComTamanho("p4", 1, 2.0, 2);

	}

	
	
	@Test
	public void testeEquals() {
		
		assertFalse(p1.equals(p2));
		assertFalse(p1.equals(p3));
		assertTrue(p1.equals(p4));
	}

	
	@Test
	public void testeHashCode() {
		
		assertTrue(p1.hashCode() != p2.hashCode());
		assertTrue(p1.hashCode() != p3.hashCode());
		assertTrue(p1.hashCode() == p4.hashCode());
	}
}
