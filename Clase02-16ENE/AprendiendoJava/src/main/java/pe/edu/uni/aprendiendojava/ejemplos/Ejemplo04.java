package pe.edu.uni.aprendiendojava.ejemplos;

import java.util.Arrays;

public class Ejemplo04 {
	
	public static void main(String[] args) {
		
			
		int[] arreglo;
		arreglo = new int[5];
		
		System.out.println("Arreglo: " + Arrays.toString(arreglo));
		
		int notas[] = {54,23,76,34,78};
		System.out.println("Notas: " + Arrays.toString(notas));
		
		String frutas[] = {"Uva","Manzana","Mango","Zandia"};
		System.out.println("Frutas: " + Arrays.toString(frutas));
	}

}
