public class Aluno extends Pessoa{

	
	// ATRIBUTOS ou CARACTERISTICAS
	private String RA;
	private String nomeCurso;
	private int codigoCurso;
	private String Turma;
	private String Sala;
	private String Turno;
	private double notaAV1 = 0;
	public double notaAV2 = 0;



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



	
}