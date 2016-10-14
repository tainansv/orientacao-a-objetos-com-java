
public class Pilha {

	private Object[] elementos;
	private int topo;
	
	public Pilha(int maximo) {
		elementos = new Object[maximo];
	}
	
	public void empilhar(Object elemento) {
		elementos[topo] = elemento;
		topo++;
	}
	
	public Object desempilhar() {
		topo--;
		return elementos[topo];
	}
	
	public Object topo() {
		return elementos[topo-1];
	}
	
	public int tamahno() {
		return topo;
	}

	public Object[] getElementos() {
		return elementos;
	}

	public void setElementos(Object[] elementos) {
		this.elementos = elementos;
	}


	public void setTopo(int topo) {
		this.topo = topo;
	}
	
	
}
