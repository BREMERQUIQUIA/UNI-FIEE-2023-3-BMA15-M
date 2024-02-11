package pe.edu.vallegrande.revisandoconceptos.uno;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class ClaseA {
	
	private int n1;
	int n2;
	protected int n3;
	public int n4;

	public ClaseA() {
		this.n1 = 100;
		this.n2 = 200;
		this.n3 = 300;
		this.n4 = 400;
	}
	
	public void metodoA(){
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("n3 = " + n3);
		System.out.println("n4 = " + n4);
	}

}
