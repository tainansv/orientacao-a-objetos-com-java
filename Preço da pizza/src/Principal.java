
public class Principal {

	public static void main(String[] args) {
		
		//cria o carrinho
		CarinhoDeCompras compras = new CarinhoDeCompras();
		
		//cria uma pizza
		Pizza p1 = new Pizza();
		p1.adicionaIngrediente("calabesa");
		p1.adicionaIngrediente("mussarela");
		
		//cria uma pizza
		Pizza p2 = new Pizza();
		p2.adicionaIngrediente("pepperoni");
		p2.adicionaIngrediente("mussarela");
		p2.adicionaIngrediente("cebola");
		
		//cria uma pizza
		Pizza p3 = new Pizza();
		p3.adicionaIngrediente("cebola");
		p3.adicionaIngrediente("mussarela");
		p3.adicionaIngrediente("requeijão");
		p3.adicionaIngrediente("parmesão");
		
		//cria uma pizza
		Pizza p4 = new Pizza();
		
		//adiciona pizzas ao carrinho
		compras.adicionaPizza(p1);
		compras.adicionaPizza(p2);
		compras.adicionaPizza(p3);
		compras.adicionaPizza(p4);

		//imprimi o total e os ingredientes
		System.out.println("Total de pizzas: "+ compras.getTotalDePizzas() + " reais.");
		Pizza.getQuantidadeIngredientes();
	}

}
