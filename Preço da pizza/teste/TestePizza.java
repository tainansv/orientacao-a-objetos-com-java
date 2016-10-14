import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestePizza {
	
	@BeforeClass
	public static void testeRegistroIngrdientes() {
		//retorna true se os ingredientes foram zerados
		assertEquals(true, Pizza.zeraRegistro());
	}

	@Test
	public void testeValorPizza() {
		
		//cria uma pizza
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("calabesa");
		p1.adicionaIngrediente("mussarela");
		
		//cria uma pizza
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("pepperoni");
		p2.adicionaIngrediente("mussarela");
		p2.adicionaIngrediente("cebola");
		
		//testa os preços de cada pizza
		assertEquals(15, p1.getPreço());
		assertEquals(20, p2.getPreço());
		
	}
	
	@Test
	public void testeSomaPizza() {
		//cria carrinho
		CarinhoDeCompras carrinho = new CarinhoDeCompras();
		
		//cria uma pizza
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("calabesa");
		p1.adicionaIngrediente("mussarela");
		
		//cria uma pizza
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("pepperoni");
		p2.adicionaIngrediente("mussarela");
		p2.adicionaIngrediente("cebola");
		
		//adciona pizzas ao carrinho
		carrinho.adicionaPizza(p1);
		carrinho.adicionaPizza(p2);
		
		//testa a soma do preço das pizzas adicionadas
		assertEquals(35, carrinho.getTotalDePizzas());
	}
	
	@Test
	public void testePizzaSemIngredientes() {
		//cria carrinho
		CarinhoDeCompras carrinho = new CarinhoDeCompras();
		
		//cria uma pizza
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("calabesa");
		p1.adicionaIngrediente("mussarela");
		
		//cria pizza sem ingredientes
		Pizza p2 = new Pizza();
		
		//adiciona pizzas
		carrinho.adicionaPizza(p1);
		carrinho.adicionaPizza(p2);
		
		//testa se o preço de p1 foi adicionada e a p2 não
		assertEquals(15, carrinho.getTotalDePizzas());
	}
}
