package pe.edu.uni.aprendiendojava.service;

import java.util.Random;

public class ArregloService2 {

	private int[] arreglo1;
	private int[] arreglo2;

	public ArregloService2() {
		// Variables
		Random random = new Random();
		int n;
		// Proceso
		n = random.nextInt(10) + 5;
		arreglo1 = genera(random, n);
		arreglo2 = genera(random, n);
	}

	private int[] genera(Random random, int n) {
		// Variables
		int[] arreglo;
		// Proceso
		arreglo = new int[n];
		for (int i = 0; i < n; i++) {
			arreglo[i] = random.nextInt(20) + 10;
		}
		// Reporte
		return arreglo;
	}

	public int[] getArreglo1() {
		return arreglo1;
	}

	public int[] getArreglo2() {
		return arreglo2;
	}

}
