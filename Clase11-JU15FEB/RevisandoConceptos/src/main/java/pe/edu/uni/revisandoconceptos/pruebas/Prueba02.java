package pe.edu.uni.revisandoconceptos.pruebas;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		
		try {
			int n1 = 10;
			int n2 = 0;
			
			if (n2 == 0) {
				throw new RuntimeException("Esto es un error");
			}
			int n3 = n1 / n2;
			
			System.out.println("n3: " + n3);
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
