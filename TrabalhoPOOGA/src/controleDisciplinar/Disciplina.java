package controleDisciplinar;

public class Disciplina {
	
	private int codigoDisciplina;
	private String nomeDisciplina;
	private int creditos;
	private int duracao;
	private int preRequisito;
	private String observacao;
	
	public Disciplina() {
		
	}
	
	public Disciplina(int codigoDisciplina, String nomeDisciplina, int creditos, int duracao, int 
			preRequisito, String observacao) {
		this.codigoDisciplina = codigoDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.creditos = creditos;
		this.duracao = duracao;
		this.preRequisito = preRequisito;
		this.observacao = observacao;
	}

	public int getCodigoDisciplina() {
		return codigoDisciplina;
	}

	public void setCodigoDisciplina(int codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getPreRequisito() {
		return preRequisito;
	}

	public void setPreRequisito(int preRequisito) {
		this.preRequisito = preRequisito;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
}
