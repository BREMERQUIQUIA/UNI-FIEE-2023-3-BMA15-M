package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class Prueba06 {
	
	public static void main(String[] args) {
		// Variables
		double x, suma;
		int n;
		// Datos
		x = 1;
		n = 1;
		// Proceso
		MateService service = new MateService();
		suma = service.sumatoria(x, n);
		// Reporte
		System.out.println("x = " + x);
		System.out.println("n : " + n);
		System.out.println("suma = " + suma);
	}

}
