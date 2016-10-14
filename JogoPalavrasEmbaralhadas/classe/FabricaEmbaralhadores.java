import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FabricaEmbaralhadores {

	public Embaralhador getEmbaralhadorAleatorio() {
		
		List<Embaralhador> lista = new ArrayList<>();
		lista.add(new EmbaralharInverter());
		lista.add(new EmbaralharRamdon());
		
		Collections.shuffle(lista);
		return lista.get(0);
	}
	
}
