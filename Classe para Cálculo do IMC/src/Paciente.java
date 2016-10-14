import java.security.acl.Permission;

public class Paciente {
	
	double peso;
	double altura;
	
	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	double calcularIMC() {
		return peso / (altura*altura);
	}
	
	double diagnostico() {
		if (calcularIMC()<=16) {
			System.out.println("Baixo peso muito grave. IMC = "+calcularIMC());
			return calcularIMC();
		}
		else if (calcularIMC()>16 && calcularIMC()<=16.99) {
			System.out.println("Baixo peso grave. IMC = "+calcularIMC());
			return calcularIMC();
		}
		else if (calcularIMC()>=17 && calcularIMC()<=18.49) {
			System.out.println("Baixo peso. IMC = "+calcularIMC());
			return calcularIMC();
		}
		else if (calcularIMC()>=18.50 && calcularIMC()<=24.99) {
			System.out.println("Peso normal. IMC = "+calcularIMC());
			return calcularIMC();
		}
		else if (calcularIMC()>=25 && calcularIMC()<=29.99) {
			System.out.println("Sobrepeso. IMC = "+calcularIMC());
			return calcularIMC();
		}
		else if (calcularIMC()>=30 && calcularIMC()<=34.99) {
			System.out.println("Obesidade grau I. IMC = "+calcularIMC());
			return calcularIMC();
		}
		else if (calcularIMC()>=35 && calcularIMC()<=39.99) {
			System.out.println("Obesidade grau II. IMC = "+calcularIMC());
			return calcularIMC();
		}
		else {
			System.out.println("Obesidade grau III (ovbesidade m�rbida). IMC = "+calcularIMC());
			return calcularIMC();
		}
	}

}
