package controleDisciplinar;

public class Aluno {
	//#region [Váriaveis]
    private String nome;
    private int numSemestres;
    //#endregion
    
    //#region [Construtor]
    public Aluno(String nome, int numSemestres) {
        this.nome = nome;
        this.numSemestres = numSemestres;
    }
    //#endregion
    
    //#region [Métodos Getters e Setters]
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumSemestres() {
		return numSemestres;
	}

	public void setDisciplinasCursadas(int numSemestres) {
		this.numSemestres = numSemestres;
	}
	//#endregion
}


