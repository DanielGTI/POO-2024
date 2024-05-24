
public class Main {
	public static void main(String[] args) {

		Aluno aluno_01 = new Aluno("Daniel", 20);
		Aluno aluno_02 = new Aluno("Maria", 22);
		
		// Definir os valores aos Atributos	
		aluno_01.setRA("123456");
		aluno_01.setCEP("123456789");
		aluno_01.setCEP("01230000");
		aluno_01.setNomeCurso("Ciência da Computação");
		aluno_01.setTurma("201");
		aluno_01.setSala("313");
		aluno_01.setTurma("Manhã");

		aluno_01.setNotaAV1(8.5);
		aluno_02.setNotaAV1(9.5);
		
		// Chamar os métodos
		aluno_01.apresentacao();
		aluno_02.apresentacao();

		aluno_01.av1();
		aluno_02.av1();

		//aluno_01.falarSobreCurso();

		
	}


}