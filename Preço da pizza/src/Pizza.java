import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {
	
	//variaveis pra armazenar os ingrediente de cada pizza e a contagem destes
	private ArrayList<String> ingredientes = new ArrayList<String>();
	private static HashMap<String, Integer> ingredientesCount = new HashMap<String, Integer>();

	//retorna os ingredientes
	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}
	
	//retorna o preço da pizza
	public int getPreço() {
		int preco;
		if (ingredientes.size() <= 2) {
			preco = 15;
		}
		else if (ingredientes.size() >= 3 && ingredientes.size() <= 5) {
			preco = 20;
		}
		else {
			preco = 23;
		}
		return preco;
	}
	
	
	//adiciona ingrediente
	void adicionaIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
		Pizza.contabilizaIngrediente(ingrediente);
	}
	
	//contabiliza o ingrediente adicionado
	static void contabilizaIngrediente(String ingrediente) {
		if(Pizza.ingredientesCount.containsKey(ingrediente)) {
			int valor = Pizza.ingredientesCount.get(ingrediente);
			Pizza.ingredientesCount.put(ingrediente, valor+1);
		}
		else {
			Pizza.ingredientesCount.put(ingrediente, 1);
		}
	}
	
	//imprimi a quantidade de cada ingrediente
	static void getQuantidadeIngredientes() {
		for (String key : ingredientesCount.keySet()) {
			int valor = ingredientesCount.get(key);
			System.out.println(key + ": " + valor);
		}
	}
	
	//zera registro de ingredientes
	static Boolean zeraRegistro() {
		Pizza.ingredientesCount.clear();
		return Pizza.ingredientesCount.isEmpty();
	}
}
