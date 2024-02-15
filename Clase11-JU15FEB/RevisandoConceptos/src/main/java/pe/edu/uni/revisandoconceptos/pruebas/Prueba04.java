package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
public class Prueba04 {
	
	public static void main(String[] args) {
			
		try {
			int nota1 = 12;
			int nota2 = 18;
			
			MateService service = new MateService();
			service.validarNota(nota1);
			service.validarNota(nota2);
			
			int prom = (nota1 + nota2) / 2;
			
			System.out.println("Promedio: " + prom);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, ex.getMessage(),
					  "ERROR", JOptionPane.ERROR_MESSAGE);
		}

	}

}
