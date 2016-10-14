import static org.junit.Assert.*;

import java.io.File;
import java.util.Map;

import org.junit.Test;

public class Teste {

	File file;
	
	@Test
	public void testeArquivo() throws Exception {
		file = new File("arquivo.txt");
		Map<String, String> mapa = ProcessadorArquivo.processar(file);
		assertEquals("Eduardo", mapa.get("nome"));
		assertEquals("Guerra", mapa.get("sobrenome"));
		assertEquals("35", mapa.get("idade"));
	}

	@Test
	public void testeArquivoVazio() throws Exception {
		file = new File("arquivoVazio.txt");
		
		try {
			Map<String, String> mapa = ProcessadorArquivo.processar(file);
		} catch (Exception e) {
			assertEquals("Arquivo vazio", e.getMessage());
		}
	}
	
	@Test
	public void testeArquivoInvalido() throws Exception {
		file = new File("arquivoFormatoInvalido.txt");
		try {
			Map<String, String> mapa = ProcessadorArquivo.processar(file);
		} catch (Exception e) {
			assertEquals("Formato invalido", e.getMessage());
		}
	}
}
