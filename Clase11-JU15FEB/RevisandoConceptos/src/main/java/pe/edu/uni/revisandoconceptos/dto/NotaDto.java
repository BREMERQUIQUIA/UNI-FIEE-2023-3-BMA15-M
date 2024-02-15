package pe.edu.uni.revisandoconceptos.dto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class NotaDto {
	
	private String estudiante;
	private int nota;

	public NotaDto() {
	}

	public NotaDto(String estudiante, int nota) {
		this.estudiante = estudiante;
		this.nota = nota;
	}

	public String getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		String texto;
		texto = "(" + estudiante + ", " + nota + ")";
		return texto;
	}
	
	

}
