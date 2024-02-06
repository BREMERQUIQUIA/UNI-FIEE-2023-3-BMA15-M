package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class Prueba04 {
	
	public static void main(String[] args) {
		// Variables
		int numero1, numero2;
		boolean rpta;
		// Datos
		numero1 = 220;
		numero2 = 284;
		// Proceso
		MateService service = new MateService();
		rpta = service.sonAmigos(numero1, numero2);
		// Reporte
		System.out.println("Numero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);
		System.out.println("Son amigos? " + rpta);
	}

}
