package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.ArregloService;

public class Prueba02 {
	
	public static void main(String[] args) {
		// Variables
		ArregloService service = new ArregloService();
		// Proceso
		String arreglo = service.notasToStr();
		// Reporte
		System.out.println("Arreglo: " + arreglo);
	}

}
