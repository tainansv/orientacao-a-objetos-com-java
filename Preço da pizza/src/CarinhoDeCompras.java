import java.util.ArrayList;

public class CarinhoDeCompras {
	
	//cria as variaveis pra armazenaras pizzas e o total
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private int total;

	//adiciona pizza
	void adicionaPizza(Pizza pizza) {
		if(pizza.getIngredientes().size() !=0) {
			this.pizzas.add(pizza);
			this.total += pizza.getPreço();
		}
	}
	
	//retorna o total
	int getTotalDePizzas() {
		return this.total;
	}
}
