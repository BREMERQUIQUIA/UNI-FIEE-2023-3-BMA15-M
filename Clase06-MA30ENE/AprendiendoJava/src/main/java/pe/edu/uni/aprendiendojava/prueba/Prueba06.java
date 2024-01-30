package pe.edu.uni.aprendiendojava.prueba;

import java.util.Arrays;
import pe.edu.uni.aprendiendojava.service.ArregloService;

public class Prueba06 {

	public static void main(String[] args) {
		// Variables
		ArregloService service;
		double promedio;
		// Proceso
		service = new ArregloService(10,14,18);
		int[] arreglo = service.getNotas();
		promedio = service.notaPromedio();
		// Reporte
		System.out.println("Arreglo: " + Arrays.toString(arreglo));
		System.out.println("Promedio: " + promedio);
	}

}
