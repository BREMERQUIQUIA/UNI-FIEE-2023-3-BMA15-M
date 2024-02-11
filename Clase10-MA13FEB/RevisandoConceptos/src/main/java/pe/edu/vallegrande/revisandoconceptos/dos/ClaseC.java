package pe.edu.vallegrande.revisandoconceptos.dos;

import pe.edu.vallegrande.revisandoconceptos.uno.ClaseA;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class ClaseC extends ClaseA{
	
	public void metodoC() {
		this.metodoA();
		System.out.println("n3 = " + this.n3);
		System.out.println("n4 = " + this.n4);
	}

}
