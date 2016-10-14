
public class CompraParcelada extends Compra {

	private int parcelas;
	private double juros;
	
	public CompraParcelada(double valor, int parcelas, double juros) {
		super(valor);
		this.parcelas = parcelas;
		this.juros = juros / 100;
	}
	
	public double total() {
		double total;
		
		total = Math.pow(this.valorCompra * this.juros, this.parcelas);
		return total;
	}
}
