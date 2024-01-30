package pe.edu.uni.aprendiendojava.prueba;

import java.util.Arrays;
import pe.edu.uni.aprendiendojava.service.ArregloService;

public class Prueba01 {
	
	public static void main(String[] args) {
		// Variables
		ArregloService service = new ArregloService();
		// Proceso
		int[] arreglo = service.getNotas();
		// Reporte
		System.out.println("Arreglo: " + Arrays.toString(arreglo));
		
	}

}
