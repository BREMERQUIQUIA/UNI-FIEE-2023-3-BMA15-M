package pe.edu.uni.aprendiendojava.dto;

public class RepoDto {

	private String serie;
	private int suma;
	private int termino;

	public RepoDto() {
	}

	public RepoDto(String serie, int suma, int termino) {
		this.serie = serie;
		this.suma = suma;
		this.termino = termino;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getSuma() {
		return suma;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

	public int getTermino() {
		return termino;
	}

	public void setTermino(int termino) {
		this.termino = termino;
	}

}
