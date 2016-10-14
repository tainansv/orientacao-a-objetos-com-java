import static org.junit.Assert.*;
import java.util.Map;

import org.junit.Test;

public class TesteLeituraArquivo {

	@Test
	public void testeArquivoLidoComSucesso(){
		String caminhoArquivo = "ArquivoCorreto.txt";
		Map<String,String> map = ProcessadorArquivo.processar(caminhoArquivo);
		assertEquals("Eduardo", map.get("nome"));
		assertEquals("Guerra", map.get("sobrenome"));
		assertEquals("35", map.get("idade"));
	}
	
	@Test
	public void testeArquivoInexistente(){
		String caminhoArquivo = "ArquivoInexistente.txt";
		try{ Map<String,String> map = ProcessadorArquivo.processar(caminhoArquivo); }
		catch (LeituraArquivoException e){ assertEquals("Arquivo inexistente",e.getMessage()); }
	}
	
	@Test
	public void testeArquivoVazio(){
		String caminhoArquivo = "ArquivoVazio.txt";
		try{ Map<String,String> map = ProcessadorArquivo.processar(caminhoArquivo); }
		catch (LeituraArquivoException e){ assertEquals("Arquivo vazio",e.getMessage()); }
	}
	
	@Test
	public void testeArquivoInvalidoDuplaSeta(){
		String caminhoArquivo = "ArquivoInvalidoDuplaSeta.txt";
		try{ Map<String,String> map = ProcessadorArquivo.processar(caminhoArquivo); }
		catch (LeituraArquivoException e){ assertEquals("Formato de arquivo inválido",e.getMessage()); }
	}
	
	@Test
	public void testeArquivoInvalidoLinhaSemSeta(){
		String caminhoArquivo = "ArquivoInvalidoLinhaSemSeta.txt";
		try{ Map<String,String> map = ProcessadorArquivo.processar(caminhoArquivo); }
		catch (LeituraArquivoException e){ assertEquals("Formato de arquivo inválido",e.getMessage()); }
	}
}
