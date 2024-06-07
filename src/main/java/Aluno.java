import java.util.Scanner;
public class Aluno extends Pessoa{

	
	// ATRIBUTOS ou CARACTERISTICAS
	private String RA;
	private String nomeCurso;
	private int codigoCurso;
	private String Turma;
	private String Sala;
	private String Turno;
	protected double notaAV1 = 0;
	protected double notaAV2 = 0;



	//	METODO CONSTRUTOR
	public Aluno(String nomeAluno, int idadeAluno){
		this.setNome(nomeAluno);
		this.setIdade(idadeAluno);
	}
	
	// MÉTODOS ACESSORES E MODIFICADORES
	public int getCodigoCurso(){
		return this.codigoCurso;
	}

	public int setCodigoCurso(int n){
		this.codigoCurso = n;
		return this.codigoCurso;
	}


	public String getRA(){
		return this.RA;
	}

	public String setRA(String n){
		this.RA = n;
		return this.RA;
	}

	public String getNomeCurso(){
		return this.nomeCurso;
	}

	public String setNomeCurso(String n){
		this.nomeCurso = n;
		return this.nomeCurso;
	}

	public String getTurma(){
		return this.Turma;
	}

	public String setTurma(String n){
		this.Turma = n;
		return this.Turma;
	}

	public String geSala(){
		return this.Sala;
	}

	public String setSala(String n){
		this.Sala = n;
		return this.Sala;
	}
	
	public String getTurno(){
		return this.Turno;
	}

	public String setTurno(String n){
		this.Turno = n;
		return this.Turno;
	}

	public double getNotaAV1(){
		return this.notaAV1;
	}

	public double setNotaAV1(double n){
		this.notaAV1 = n;
		return this.notaAV1;
	}
		
	
	// MÉTODOS ou AÇÕES (funções)
	void apresentacao(){
		System.out.println("Olá, meu nome é " + this.getNome() + " e tenho " + this.getIdade() + " anos.");
	}

	void falarSobreCurso(){
		
		System.out.printf("\nEu estou cursando o curso de " + this.getNomeCurso() + " na Universidade Nove de Julho.\n");

		// System.out.printf("\nEu estou cursando o curso de %s na Universidade Nove de Julho.\n", this.nomeCurso);

		
		System.out.printf("\nMinha turma é a " + this.getTurma() + " e minha sala é a " +this.Sala + " e atualmente no Turno da " + this.getTurno() + ".\n");
	}


	
	
	void assistirAula(){
		System.out.printf("Prestando atenção.\n");
	}

	void fazerAtividade(){
		System.out.printf("Programando em Java.\n");
	}


	public void prova_AV1(){
		double nota=0;
		
		System.out.printf("\nBem vindo a prova AV1.\nBoa sorte.\n\n");
		nota += questao1();
		nota += questao2();

		
		this.setNotaAV1(nota);
		System.out.printf("\n\nA sua nota foi %.1f\n", this.getNotaAV1());
	}

	private int questao1(){
		Scanner entrada = new Scanner(System.in);
		int valor=0, alternativa;
		System.out.printf("\nQuestão 1:\n");
		System.out.printf("\nConsiderando os tipos de dados em Java, qual o mais indicado para armazenar valores monetários (R$)?\n\n");
		System.out.println("1) int");
		System.out.println("2) boolean");
		System.out.println("3) double");
		System.out.println("4) String");
		System.out.println("5) char");
		System.out.printf("Escolha uma opção: ");
		alternativa = entrada.nextInt();
		if( alternativa == 3 ){
			valor = 1;
		}
		return valor;
	}

	private int questao2(){
		Scanner entrada = new Scanner(System.in);
		int valor=0, alternativa;
		System.out.printf("\nQuestão 2:\n");
		System.out.printf("\nConsiderando os tipos de dados em Java, qual o mais indicado para armazenar a idade do aluno?\n\n");
		System.out.println("1) int");
		System.out.println("2) boolean");
		System.out.println("3) double");
		System.out.println("4) String");
		System.out.println("5) char");
		System.out.printf("Escolha uma opção: ");
		alternativa = entrada.nextInt();
		if( alternativa == 1 ){
			valor = 1;
		}
		return valor;
	}

	
}