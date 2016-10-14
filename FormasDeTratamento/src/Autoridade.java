
public class Autoridade {
	
	private String nome;
	private String sobrenome;
	private FormatadorNome nomeFormatado;
	
	public Autoridade(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	

	public String getTratamento(String tratamento, String opção) {
		
		if (tratamento == "informal") {
			nomeFormatado = new Informal();
			return nomeFormatado.formatarNome(this.nome, this.sobrenome);
		}
		else if (tratamento == "respeitoso") {
			nomeFormatado = new Respeitoso(opção);
			return nomeFormatado.formatarNome(this.nome, this.sobrenome);
		}
		else if (tratamento.contains("titulo")) {
			nomeFormatado = new ComTitulo(opção);
			return nomeFormatado.formatarNome(this.nome, this.sobrenome);
		}
		else {
			return "tratamento não encontrado";
		}
		
	}
}