
public class Principal {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha(10);
		pilha.empilhar("Eduardo");
		pilha.empilhar("Maria");
		pilha.empilhar("José");
		
		System.out.println(pilha.topo());
		System.out.println(pilha.tamahno());
		
		
		System.out.println(pilha.desempilhar());
		System.out.println(pilha.topo());
		System.out.println(pilha.tamahno());
	}

}
