public class Aluno implements AulaPresencial{

	
	// ATRIBUTOS ou CARACTERISTICAS
	private String nome;
	private int idade;
	private String RA;
	private String CPF;
	private String CEP;
	private String nomeCurso;
	private int codigoCurso;
	private String Turma;
	private String Sala;
	private String Turno;
	private double notaAV1 = 0;
	public double notaAV2 = 0;



	//	METODO CONSTRUTOR
	public Aluno(String nomeAluno, int idadeAluno){
		this.nome = nomeAluno;
		this.idade = idadeAluno;
	}
	
	// MÉTODOS ACESSORES E MODIFICADORES
	public int getIdade(){
		return this.idade;
	}

	public int setIdade(int n){
		this.idade = n;
		return idade;
	}
	
	public int getCodigoCurso(){
		return this.codigoCurso;
	}

	public int setCodigoCurso(int n){
		this.codigoCurso = n;
		return this.codigoCurso;
	}

	public String getNome(){
		return this.nome;
	}

	public String setNome(String n){
		this.nome = n;
		return this.nome;
	}

	public String getRA(){
		return this.RA;
	}

	public String setRA(String n){
		this.RA = n;
		return this.RA;
	}

	public String getCPF(){
		return this.CPF;
	}

	public String setCPF(String n){
		this.CPF = n;
		return this.CPF;
	}
	
	public String getCEP(){
		return this.CEP;
	}

	public String setCEP(String n){
		this.CEP = n;
		return this.CEP;
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
	
	//	MÉTODOS ABSTRATOS
	@Override
	public void av1(){
		if (this.notaAV1 != 0){
			System.out.printf("AV1 do aluno %s = %f\n", this.nome, this.notaAV1);
		} else{
			System.out.printf("\n%s ainda não realizou a AV1.\n", this.getNome());
		}
		
		
	}

	@Override
	public void av2(){
		
	}
	@Override
	public void entradaCatraca(){
		
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