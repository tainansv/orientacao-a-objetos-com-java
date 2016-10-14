import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCompraParcelada {

	@Test
	public void testeParcela1() {
		Compra compra = new CompraParcelada(15, 1, 5);
		
		assertEquals(15, compra.total(), 16);
	}

	@Test
	public void testeParcela2() {
		Compra compra = new CompraParcelada(15, 2, 5);
		
		assertEquals(16, compra.total(), 17);
	}
	
	@Test
	public void testeParcela5() {
		Compra compra = new CompraParcelada(15, 5, 5);
		
		assertEquals(19, compra.total(), 20);
	}
	
	@Test
	public void testeParcela10() {
		Compra compra = new CompraParcelada(15, 10, 5);
		
		assertEquals(24, compra.total(), 25);
	}
}
