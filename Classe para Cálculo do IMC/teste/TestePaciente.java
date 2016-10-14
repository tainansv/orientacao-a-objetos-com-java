import static org.junit.Assert.*;

import org.junit.Test;

public class TestePaciente {

	@Test
	public void testBaixoPesoMuitoGrave() {
		Paciente paciente = new Paciente(40, 1.75);
		assertEquals(12, paciente.diagnostico(), 16.5);
	}
	
	@Test
	public void testBaixoPesoGrave() {
		Paciente paciente = new Paciente(55, 1.75);
		assertEquals(16, paciente.diagnostico(), 16.99);
	}
	
	@Test
	public void testBaixoPeso() {
		Paciente paciente = new Paciente(58, 1.75);
		assertEquals(17, paciente.diagnostico(), 18.49);
	}
	
	@Test
	public void testNormal() {
		Paciente paciente = new Paciente(65, 1.75);
		assertEquals(18.5, paciente.diagnostico(), 24.99);
	}
	
	@Test
	public void testSobrepeso() {
		Paciente paciente = new Paciente(90, 1.75);
		assertEquals(25, paciente.diagnostico(), 29.9);
	}
	
	@Test
	public void testObesidadeI() {
		Paciente paciente = new Paciente(110, 1.75);
		assertEquals(30, paciente.diagnostico(), 34.9);
	}
	
	@Test
	public void testObesidadeII() {
		Paciente paciente = new Paciente(120, 1.75);
		assertEquals(35, paciente.diagnostico(), 39.9);
	}
	
	@Test
	public void testObesidadeIII() {
		Paciente paciente = new Paciente(150, 1.75);
		assertEquals(40, paciente.diagnostico(), 50);
	}

}
