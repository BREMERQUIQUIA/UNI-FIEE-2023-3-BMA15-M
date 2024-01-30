package pe.edu.uni.aprendiendojava.service;

import java.util.Arrays;
import java.util.Random;

public class ArregloService {

	private int notas[];
	private int n;

	public ArregloService() {
		Random rnd = new Random();
		n = rnd.nextInt(10) + 5;
		notas = new int[n];
		for (int i = 0; i < notas.length; i++) {
			notas[i] = rnd.nextInt(21);
		}
	}

	public ArregloService(int... arreglo) {
		notas = arreglo;
		n = arreglo.length;
	}

	public ArregloService(String arreglo) {
		// Variables
		String[] arreglo1;
		// Proceso
		arreglo1 = arreglo.split(",");
		n = arreglo1.length;
		notas = new int[n];
		for (int i = 0; i < arreglo1.length; i++) {
			String notaStr = arreglo1[i];
			notas[i] = Integer.parseInt(notaStr.trim());
		}
	}

	public int getN() {
		return n;
	}

	public int[] getNotas() {
		return notas;
	}

	public String notasToStr() {
		return Arrays.toString(notas);
	}

	public int cantidadAprobados() {
		//Variables
		int cantidad_aprobados = 0;
		//Proceso
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 10) {
				cantidad_aprobados++;
			}
		}
		//Reporte
		return cantidad_aprobados;
	}

	public int cantidadDesaprobados() {
		//Variables
		int cantidad_desaprobados = 0;
		//Proceso
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 10) {
				cantidad_desaprobados++;
			}
		}
		//Reporte
		return cantidad_desaprobados;
	}

	public double notaPromedio() {
		//Variables
		double promedio;
		//Proceso
		promedio = 0;
		for (int i = 0; i < notas.length; i++) {
			promedio = promedio + notas[i];
		}
		promedio /= notas.length;
		//Reporte
		return promedio;
	}

	public double mediana() {
		// Variables
		double mediana;
		int[] auxiliar;
		int m;
		// Proceso
		auxiliar  = Arrays.copyOf(notas, notas.length);
		Arrays.sort(auxiliar);
		m = auxiliar.length;
		if (auxiliar.length % 2 == 0) {
			mediana = (auxiliar[m / 2] + auxiliar[(m / 2) - 1]) / 2;
		} else {
			mediana = auxiliar[(m / 2)];
		}
		// Reporte
		return mediana;
	}
}
