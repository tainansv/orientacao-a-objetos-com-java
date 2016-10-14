
public class MecanicaComTentativa implements MecanicaDoJogo {

	private int pontuacao;
	private int palavras;
	private int tentativa;
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
			pontuacao += 10 - tentativa * 3;
			tentativa = 3;
			return "Acertou!\n";
		}
		else {
			tentativa++;
			return "Errou...\n";
		}
		
	} 
	
	@Override
	public boolean tentativa() {
		if (tentativa < 3) {
			return true;
		}
		else {
			tentativa = 0;
			palavras++;
			return false;
		}
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
		return "\n3 tentativas por palavra, começando com o valor de 10 pontos\n"
				+ "e diminuindo 3 pontos do valor possível à cada erro\n";
	}

}

