package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.ArregloService;

public class Prueba03 {
	
	public static void main(String[] args) {
		// Variables
		ArregloService service ;
		// Proceso
		service = new ArregloService(12,10,15,18,15,13,8,5);
		String arreglo = service.notasToStr();
		// Reporte
		System.out.println("Arreglo: " + arreglo);
	}

}
