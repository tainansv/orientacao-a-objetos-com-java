
public interface MecanicaDoJogo {
	
	public String embaralhador(String palavra);
	
	public String verificaAcerto(String palavra, String tentativa);
	
	public boolean tentativa();
	
	public boolean fimDejogo();
	
	public int pontuacaoFinal();
	
	public String mensagem();
}
