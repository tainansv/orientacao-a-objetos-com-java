import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

	Produto p1;
	Produto p2;
	Produto p3;
	Produto p4;
	Produto p5;
	CarrinhoDeCompras carrinho;
	
	@Before
	public void inicializaProdutos() {
		p1 = new Produto("p1", 1, 2.2);
		p2 = new Produto("p2", 2, 2.4);
		p3 = new ProdutoComTamanho("p3", 3, 2.1, 4);
		p4 = new ProdutoComTamanho("p4", 1, 2.3, 5);
		p5 = new ProdutoComTamanho("p5", 3, 2.7, 4); //igual p3
		
		carrinho = new CarrinhoDeCompras();
	}
	
	@Test
	public void testeAdcionarProduto() {
		carrinho.adicionarProduto(p1);
		carrinho.adicionarProduto(p2);
		carrinho.adicionarProduto(p3);
		carrinho.adicionarProduto(p4);
		carrinho.adicionarProduto(p5);
		carrinho.adicionarProduto(p2);
		
		assertTrue(carrinho.getCompras().containsKey(p1) && carrinho.getCompras().get(p1) == 1);
		assertTrue(carrinho.getCompras().containsKey(p2) && carrinho.getCompras().get(p2) == 2);
		assertTrue(carrinho.getCompras().containsKey(p3) && carrinho.getCompras().get(p3) == 2);
		assertTrue(carrinho.getCompras().containsKey(p4) && carrinho.getCompras().get(p4) == 1);
	}
	

	@Test
	public void TesteRemoverProduto() {
		
		carrinho.adicionarProduto(p1);
		carrinho.adicionarProduto(p1);
		carrinho.adicionarProduto(p1);
		
		assertTrue(carrinho.getCompras().get(p1) == 3);
		
		carrinho.removeProduto(p1, 1);
		
		assertTrue(carrinho.getCompras().get(p1) == 2);
	}
	
	@Test
	public void testeCalcularPreco() {
		
		carrinho.adicionarProduto(p1);
		carrinho.adicionarProduto(p2);
		carrinho.adicionarProduto(p3);
		
		assertEquals(6.6, carrinho.calcularPreco(), 6.7);
	}

}
