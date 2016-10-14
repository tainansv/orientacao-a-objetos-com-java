
public class EmbaralharInverter implements Embaralhador {

	//Embaralha a palavra invertendo a string
	@Override
	public String embaralhar(String palavra) {
		
		StringBuilder builder = new StringBuilder(palavra);
		builder.reverse();
		return builder.toString();
	}

}
