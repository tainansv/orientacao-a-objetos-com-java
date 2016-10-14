
public class FabricaMecanicaDoJogo {
	
	public MecanicaDoJogo getMecanica(String opcao) {
		if (opcao.equals("com") || opcao.equals("c")) {
			return new MecanicaComTentativa();
		}
		else{
			return new MecanicaSemTentativa();
		}
	}
}
