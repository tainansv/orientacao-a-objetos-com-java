import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	//cria hashmap
	private Map<Produto, Integer> compras = new HashMap<>();
	
	
	public Map<Produto, Integer> getCompras() {
		return compras;
	}

	//adicionar produtos
	public void	adicionarProduto(Produto produto) {
		if (compras.containsKey(produto)) {
			int qtd = compras.get(produto);
			compras.put(produto, qtd+1);
		}else {
			compras.put(produto, 1);
		}
	}
	
	//remover quantidade de um produto
	public void removeProduto(Produto produto, int quantidade) {
		if (compras.containsKey(produto)) {
			if (compras.get(produto) >= quantidade) {
				int qtd = compras.get(produto);
				compras.put(produto, qtd - quantidade);
				if (compras.get(produto) <= 0) {
					compras.remove(produto);
				}
			}
		}
	}
	
	//calcular o preço de todos os produtos
	public double calcularPreco() {
		double preco = 0;
		for (Produto produto : compras.keySet()) {
			preco += produto.getPreco();
		}
		return preco;
	}
}
