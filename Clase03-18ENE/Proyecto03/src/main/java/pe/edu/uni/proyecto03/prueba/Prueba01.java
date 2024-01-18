package pe.edu.uni.proyecto03.prueba;

import pe.edu.uni.proyecto03.service.MateService;

public class Prueba01 {
	
	public static void main(String[] args) {
		// Variables
		int n1, n2, suma;
		// Datos
		n1 = 30;
		n2 = 50;
		// Proceso
		MateService service = new MateService();
		suma = service.sumar(n1, n2);
		// Reporte
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("suma: " + suma);
	}

}
