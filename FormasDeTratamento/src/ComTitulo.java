
public class ComTitulo implements FormatadorNome {
	
	private String titulo;
	
	public ComTitulo(String opçao) {
		this.titulo = opçao;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		return titulo + " " + nome + " " + sobrenome;
	}

}
