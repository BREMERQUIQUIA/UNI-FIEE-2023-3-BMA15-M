package pe.edu.uni.aprendiendojava.prueba;

import java.util.Arrays;
import pe.edu.uni.aprendiendojava.service.ArregloService2;

public class Prueba10 {

	public static void main(String[] args) {
		// Variables
		int[] arreglo1;
		int[] arreglo2;
		int[] arregloComun;
		int[] arregloDiferencia;
		// Proceso
		ArregloService2 service2 = new ArregloService2();
		arreglo1 = service2.getArreglo1();
		arreglo2 = service2.getArreglo2();
		arregloComun = service2.arregloIntercepcion();
		arregloDiferencia = service2.arregloDiferencia();
		
		// Reporte
		System.out.println("Arreglo 1: " + Arrays.toString(arreglo1));
		System.out.println("Arreglo 2: " + Arrays.toString(arreglo2));
		System.out.println("Comun: " + Arrays.toString(arregloComun));
		System.out.println("Diferencia: " + Arrays.toString(arregloDiferencia));
	}
}
