package pe.edu.uni.revisandoconceptos.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class GenericoDemo<T> {

	private T dato;
	public GenericoDemo(T dato) {
		this.dato = dato;
	}

	public void mostrarTipo(){
		System.out.println("Tipo: " + dato.getClass());
	}
	
	
	
}
