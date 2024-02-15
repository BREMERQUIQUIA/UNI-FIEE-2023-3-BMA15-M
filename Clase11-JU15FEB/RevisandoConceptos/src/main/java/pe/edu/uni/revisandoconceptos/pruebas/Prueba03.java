package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import pe.edu.uni.revisandoconceptos.service.MateService;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba03 {
	
	public static void main(String[] args) {
		
		try {
			int n1 = 10;
			int n2 = 0;
			
			MateService service = new MateService();
			int n3 = service.dividir(n1, n2);
			
			System.out.println("n3: " + n3);
		} catch (Exception ex) {
			Logger.getLogger(Prueba03.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
