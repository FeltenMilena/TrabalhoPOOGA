package controleDisciplinar;

public class Curso {
	
	//#region [Váriaveis]
	private String nomeCurso;
    private static Disciplina[] disciplinas = {
        new Disciplina(60963, "Raciocínio Lógico", 1, 60),
        new Disciplina(60964, "Algoritimos e Programação: Fundamentos", 1, 120),
        new Disciplina(60965, "Computação: Conceitos e Tendências da Profissão", 1, 60),
        new Disciplina(60803, "Fundamentos de Álgebra Linear", 1, 60),
        new Disciplina(30850, "Pensamento Computacional", 2, 60)
    };
    private static Disciplina[] disciplinasCursadas = {
            disciplinas[0],
            disciplinas[2],
            disciplinas[4]
    };
    private static Disciplina[] disciplinasFaltantes = {
            disciplinas[1],
            disciplinas[3],
    };
    //#endregion
    
    //#region [Construtor]
    public Curso(String nomeCurso) {
    	this.nomeCurso = nomeCurso;
    }
    //#endregion
    
    //#region [Métodos Getters e Setters]
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
    
    public String getNomeCurso() {
		return nomeCurso;
	}

	public static void setDisciplinas(Disciplina[] disciplinas) {
		Curso.disciplinas = disciplinas;
	}
    
	public static Disciplina[] getDisciplinas() {
        return disciplinas;
    }
	
	public static void setDisciplinasCursadas(Disciplina[] disciplinasCursadas) {
		Curso.disciplinasCursadas = disciplinasCursadas;
	}
	
    public static Disciplina[] getDisciplinasCursadas() {
        return disciplinasCursadas;
    }
    
	public static void setDisciplinasFaltantes(Disciplina[] disciplinasFaltantes) {
		Curso.disciplinasFaltantes = disciplinasFaltantes;
	}
	
    public static Disciplina[] getDisciplinasFaltantes() {
        return disciplinasFaltantes;
    }
    //#endregion
}

