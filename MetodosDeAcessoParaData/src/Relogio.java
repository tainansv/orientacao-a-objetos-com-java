
public class Relogio {
	
	private long controle;
	

	public long getControle() {
		return controle;
	}


	public void setControle(int controle) {
		this.controle = controle;
	}


	public long agora() {
		if (controle == 0) {
			return System.currentTimeMillis();
		}else {
			return controle;
		}
	}
}
