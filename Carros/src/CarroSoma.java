
public class CarroSoma extends CarroDeCorrida {
	
	private int potencia;
	
	public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
		super(nome, velocidadeMaxima);
		this.nome = nome;
		this.potencia = potencia;
		this.velocidadeMaxima = velocidadeMaxima;
		this.velocidade = 0;
	}

	public void acelerar(){
		velocidade += potencia;
		if (velocidade > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
		}
	}
	
	
}
