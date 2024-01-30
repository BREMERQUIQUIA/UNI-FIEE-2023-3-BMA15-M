package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.service.ArregloService;

public class Prueba05 {
	
	public static void main(String[] args) {
		// Variables
		ArregloService service ;
		int aprobados;
		int desaprobados;
		// Proceso
		service = new ArregloService("12, 10,15, 18,15 , 13, 8,5");
		String arreglo = service.notasToStr();
		aprobados= service.cantidadAprobados();
		desaprobados= service.cantidadDesaprobados();
		// Reporte
		System.out.println("Arreglo: " + arreglo);
		System.out.println("Aprobados: "+ aprobados);
		System.out.println("Desaprobados: "+desaprobados);
	}

}
