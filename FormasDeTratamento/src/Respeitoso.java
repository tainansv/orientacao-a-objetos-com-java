
public class Respeitoso implements FormatadorNome {

	private String sexo;
	
	public Respeitoso(String opção) {
		this.sexo = opção;
	}
	
	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (sexo == "masculino" || sexo == "m") {
			return "Sr. " + sobrenome;
		}else {
			return "Sra. " + sobrenome;
		}
	}

}
