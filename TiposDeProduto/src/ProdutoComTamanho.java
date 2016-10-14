
public class ProdutoComTamanho extends Produto {
	
	private int tamanho;

	//construtor
	public ProdutoComTamanho(String nome, int codigo,Double preco, int tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
	
	//método get
	public int getTamanho() {
		return tamanho;
	}

	//sobrescrever o método equals
		@Override
		public boolean equals(Object x) {
			if (x instanceof ProdutoComTamanho &&
					((ProdutoComTamanho) x).getCodigo() == this.getCodigo() &&
					((ProdutoComTamanho) x).getTamanho() == this.getTamanho()) {
				return true;
			}else {
				return false;
			}
		}
		
		//sobrecrever o método hashCode
		@Override
		public int	hashCode() {
			return getCodigo() * getTamanho();
		}
}
