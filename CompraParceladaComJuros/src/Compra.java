
public class Compra {

	protected double valorCompra;
	
	public Compra(Double valor) {
		this.valorCompra += valor;
	}
	
	public double total() {
		return this.valorCompra;
	}
}
