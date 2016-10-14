import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {

	private Date dataDeNascimento;


	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(int dia, int mes, int ano){
		Calendar data = new GregorianCalendar(ano, mes-1, dia);
		dataDeNascimento = data.getTime(); ;
	}
	
	public int getIdade() {
		
		//cria a data de nascimento
		Calendar nascimento = new GregorianCalendar();
		nascimento.setTime(dataDeNascimento);
		
		//cria a data atual de cordo com a resposta da classe relogio
		Relogio relogio = new Relogio();
		Calendar agora = new GregorianCalendar();
		Date agoraDate = new Date(relogio.agora());
		agora.setTime(agoraDate);
		
		//retorna a idade
		int idade = agora.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
		nascimento.add(Calendar.YEAR, idade);
		if (agora.before(nascimento)) {
			idade--;
		}
		return idade;
	}
	
	public String getSigno() {
		Calendar data = new GregorianCalendar();
		data.setTime(dataDeNascimento);
		int dia = data.get(Calendar.DAY_OF_MONTH);
		int mes = data.get(Calendar.MONTH) + 1;
		
		if (dia >= 21 && mes == 3 || dia <= 20 && mes == 4) {
			return "Áries";
		}
		else if (dia >= 21 && mes == 4 || dia <= 20 && mes == 5) {
			return "Touro";
		}
		else if (dia >= 21 && mes == 5 || dia <= 20 && mes == 6) {
			return "Gêmeos";
		}
		else if (dia >= 21 && mes == 6 || dia <= 21 && mes == 7) {
			return "Câncer";
		}
		else if (dia >= 22 && mes == 7 || dia <= 22 && mes == 8) {
			return "Leão";
		}
		else if (dia >= 23 && mes == 8 || dia <= 22 && mes == 9) {
			return "Virgem";
		}
		else if (dia >= 23 && mes == 9 || dia <= 21 && mes == 10) {
			return "Libra";
		}
		else if (dia >= 22 && mes == 10 || dia <= 21 && mes == 11) {
			return "Escorpião";
		}
		else if (dia >= 22 && mes == 4 || dia <= 21 && mes == 12) {
			return "Sagitário";
		}
		else if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1) {
			return "Capricórnio";
		}
		else if (dia >= 21 && mes == 1 || dia <= 19 && mes == 2) {
			return "Aquário";
		}
		else {
			return "Peixes";
		}
	}
}
