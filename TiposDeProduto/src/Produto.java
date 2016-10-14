
public class Produto {

	//cria atributos
	private String nome;
	private int codigo;
	private double preco;
	
	//construtor
	public Produto(String nome, int codigo, double preco) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}


	//métodos get e set
	public double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public int getCodigo() {
		return codigo;
	}

	//sobrescrever o método equals
	@Override
	public boolean equals(Object x) {
		if (x instanceof Produto &&
				((Produto) x).getCodigo() == this.getCodigo()) {
			return true;
		}else {
			return false;
		}
	}
	
	//sobrecrever o método hashCode
	@Override
	public int	hashCode() {
		return getCodigo();
	}
}
