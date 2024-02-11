package pe.edu.vallegrande.revisandoconceptos.service;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class UtilView {

	private UtilView() {
	}
	
	public static final String CRUD_NUEVO;
	public static final String CRUD_EDITAR;
	public static final String CRUD_ELIMINAR;
	
	static {
		CRUD_NUEVO = "NUEVO";
		CRUD_EDITAR = "EDITAR";
		CRUD_ELIMINAR = "ELIMINAR";
	}

}
