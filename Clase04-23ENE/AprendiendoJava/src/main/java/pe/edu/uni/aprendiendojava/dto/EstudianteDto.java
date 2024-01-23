package pe.edu.uni.aprendiendojava.dto;

public class EstudianteDto {

	private int id;
	private String nombre;
	private int exaParcial;
	private int exaFinal;
	private int promedio;
	private String condicion;

	/**
	 * Constructor por defecto
	 */
	public EstudianteDto() {
		this(1000, "Gustavo", 18, 20, 19, "Aprobado");
	}

	/**
	 * Constructor adicional
	 *
	 * @param id Id del estudiante.
	 * @param nombre Nombre del estudiante.
	 * @param exaParcial Nota del examen parcial.
	 * @param exaFinal Nota del examen final.
	 * @param promedio Nota promedio.
	 * @param condicion Condicion de aprobado o desaprobado.
	 */
	public EstudianteDto(int id, String nombre, int exaParcial, int exaFinal, int promedio, String condicion) {
		this.id = id;
		this.nombre = nombre;
		this.exaParcial = exaParcial;
		this.exaFinal = exaFinal;
		this.promedio = promedio;
		this.condicion = condicion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExaParcial() {
		return exaParcial;
	}

	public void setExaParcial(int exaParcial) {
		this.exaParcial = exaParcial;
	}

	public int getExaFinal() {
		return exaFinal;
	}

	public void setExaFinal(int exaFinal) {
		this.exaFinal = exaFinal;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	@Override
	public String toString() {
		String texto = "[";
		texto += "id:" + id + ", ";
		texto += "nombre:" + nombre + ", ";
		texto += "parcial:" + exaParcial + ", ";
		texto += "final:" + exaFinal + ", ";
		texto += "promedio:" + promedio + ", ";
		texto += "condicion:" + condicion;
		texto += "]";
		return texto;
	}

}
