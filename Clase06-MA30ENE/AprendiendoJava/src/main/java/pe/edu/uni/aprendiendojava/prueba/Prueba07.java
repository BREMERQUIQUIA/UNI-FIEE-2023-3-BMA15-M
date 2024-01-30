package pe.edu.uni.aprendiendojava.prueba;

import java.util.Arrays;
import pe.edu.uni.aprendiendojava.service.ArregloService;

public class Prueba07 {

	public static void main(String[] args) {
		// Variables
		ArregloService service;
		double promedio;
		double mediana;
		// Proceso
		service = new ArregloService(14,10,18,12,17,16);
		int[] arreglo = service.getNotas();
		promedio = service.notaPromedio();
		mediana = service.mediana();
		// Reporte
		System.out.println("Arreglo: " + Arrays.toString(arreglo));
		System.out.println("Promedio: " + promedio);
		System.out.println("Mediana : " + mediana);
	}

}
