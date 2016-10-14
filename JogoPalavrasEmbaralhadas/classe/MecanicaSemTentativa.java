
public class MecanicaSemTentativa implements MecanicaDoJogo {

	private int pontuacao;
	private int palavras;
	private FabricaEmbaralhadores fabricaEmbaralhadores = new FabricaEmbaralhadores();
	private Embaralhador embaralhador = fabricaEmbaralhadores.getEmbaralhadorAleatorio();
	
	@Override
	public String embaralhador(String palavra) {
		if (embaralhador == null) {
			embaralhador = fabricaEmbaralhadores.getEmbaralhadorAleatorio();
		}
		return embaralhador.embaralhar(palavra);
	}
	
	@Override
	public String verificaAcerto(String palavra, String sugestao) {
		if (palavra.equals(sugestao)) {
			pontuacao += 10;
			return "Acertou!\n";
		}
		else {
			return "Errou...\n";
		}
	}
	
	@Override
	public boolean tentativa() {
		palavras++;
		return false;
	}
	
	@Override
	public boolean fimDejogo() {
		if (palavras == 5) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public int pontuacaoFinal() {
		return pontuacao;
	}
	
	@Override
	public String mensagem() {
		return "\nSem tentativas, 10 pontos por acerto\nBoa sorte!\n";
	}
}
