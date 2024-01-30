package pe.edu.uni.aprendiendojava.service;

import java.util.Arrays;
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

	/**
	 * Retorna el arreglo intercepcion, sin duplicados.
	 *
	 * @return
	 */
	public int[] arregloIntercepcion() {
		// Variables
		int[] arregloComun = null;
		// Proceso
		for (int dato : arreglo1) {
			if(existe(arreglo2, dato)){
				arregloComun = agregarElemento(arregloComun, dato);
			}
		}
		// Reporte
		return arregloComun;
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

	private boolean existe(int[] arreglo, int dato) {
		// Control
		if(arreglo==null){
			return false;
		}
		// Variables
		boolean existeDato;
		// Proceso
		existeDato = false;
		for (int valor : arreglo) {
			if(valor==dato){
				existeDato = true;
				break;
			}
		}
		// Reporte
		return existeDato;
	}
	
	private int[] agregarElemento(int[] arreglo, int dato){
		// Control
		if(arreglo==null){
			return new int[]{dato};
		}
		// Variables
		int[] arregloDestino;
		// Proceso
		arregloDestino = new int[arreglo.length + 1];
		System.arraycopy(arreglo, 0, arregloDestino, 0, arreglo.length);
		arregloDestino[arreglo.length] = dato;
		// Reporte;
		return arregloDestino;
	}
	
}
