package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		// Variables
		int numero;
		boolean rpta;
		// Datos
		numero = 0;
		// Proceso
		MateService service = new MateService();
		rpta = service.esPerfecto(numero);
		// Reporte
		System.out.println("Numero: " + numero);
		System.out.println("Es perfecto? " + rpta);
	}

}
