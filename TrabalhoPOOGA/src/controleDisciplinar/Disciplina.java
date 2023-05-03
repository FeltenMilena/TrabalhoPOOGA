package controleDisciplinar;

public class Disciplina {
	
	//#region [Váriaveis]
	private int codigoDisciplina;
    private String nome;
    private int semestre;
    private int cargaHoraria;
    //#endregion

    //#region [Construtor]
    public Disciplina(int codigoDisciplina, String nome, int semestre, int cargaHoraria) {
    	this.codigoDisciplina = codigoDisciplina;
        this.nome = nome;
        this.semestre = semestre;
        this.cargaHoraria = cargaHoraria;
    }
    //#endregion
    
    //#region [Métodos Getters e Setters]
    public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
        return nome;
    }
	
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

    public int getSemestre() {
        return semestre;
    }
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	//#endregion
}

