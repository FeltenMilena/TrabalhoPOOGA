package controleDisciplinar;

public class Aluno {
    
    private int matricula;
    private int cpf;
    private String nome;
    private String dataNasc;
    
    public Aluno() {
    	
    }

    public Aluno(int matricula, int cpf, String nome, String dataNasc) {
        this.matricula = matricula;
        this.cpf = cpf;
    	this.nome = nome;
    	this.dataNasc = dataNasc;
    }
    
    public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
}

