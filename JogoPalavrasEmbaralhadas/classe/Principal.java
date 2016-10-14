import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		String entrada;
		String palavra = null;
		String palavraEmbaralhada;
		FabricaMecanicaDoJogo fabrica = new FabricaMecanicaDoJogo();
		BancoDePalavras banco = new BancoDePalavras();
		MecanicaDoJogo mecanica;
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("\nJogo das Palavras Embaralhadas");
		System.out.println("Você tem cinco palavras para acertar!");
		System.out.println("Com ou sem tentativas para cada palavra?");
		entrada = scanner.nextLine();
		
		mecanica = fabrica.getMecanica(entrada);
		System.out.println(mecanica.mensagem());

		while (mecanica.fimDejogo()) {
			try {
				palavra = banco.getPalavra();
			} catch (IOException e) {
				System.out.println("Erro ao obter palavra do arquivo");
			}
			palavraEmbaralhada = mecanica.embaralhador(palavra);
			
			do {
				System.out.println("Que palavra é esta? "+palavraEmbaralhada);
				entrada = scanner.nextLine();
				System.out.println(mecanica.verificaAcerto(palavra, entrada));
			} while (mecanica.tentativa());
		}
		
		System.out.println("Pontuação final: "+ mecanica.pontuacaoFinal());
		System.out.println("Jogar novamente?\n");
		entrada = scanner.nextLine();
		if (entrada.equals("s") || entrada.equals("sim")) {
			main(null);
		}
		else {
			scanner.close();
		}
	}
}
