import static org.junit.Assert.*;

import org.junit.Test;

public class AutenticadorTest {

	@Test
	public void loginComSucesso() throws LoginException{
		Autenticador a = new Autenticador();	
		Usuario u = a.logar("guerra", "senhadoguerra");
		assertEquals("guerra", u.getLogin());
	}
	
	@Test(expected=LoginException.class)
	public void loginCoFalha() throws LoginException{
		Autenticador a = new Autenticador();	
		Usuario u = a.logar("guerra", "senhadogduerra");
		assertEquals("guerra", u.getLogin());
	}

	@Test
	public void loginInformacaoErro(){
		Autenticador a = new Autenticador();	
		try {
			Usuario u = a.logar("guerra", "senhadoghuerra");
			fail();
		} catch (LoginException e) {
			assertEquals("guerra", e.getLogin());
		}
	}
}
