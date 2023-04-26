package controleDisciplinar;

public class Curso {
	
	private int codigoCurso;
    private String nome;
    private String coordenador;
    private String tipo;
    private int duracaoTotal;
    private int creditosTotal;
    
    public Curso() {
    	
    }
    
	public Curso(int codigoCurso, String nome, String coordenador, String tipo, int duracaoTotal, int creditosTotal) {
		this.codigoCurso = codigoCurso;
		this.nome = nome;
		this.coordenador = coordenador;
		this.tipo = tipo;
		this.duracaoTotal = duracaoTotal;
		this.creditosTotal = creditosTotal;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(String coordenador) {
		this.coordenador = coordenador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getDuracaoTotal() {
		return duracaoTotal;
	}

	public void setDuracaoTotal(int duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}

	public int getCreditosTotal() {
		return creditosTotal;
	}

	public void setCreditosTotal(int creditosTotal) {
		this.creditosTotal = creditosTotal;
	}
    
}
