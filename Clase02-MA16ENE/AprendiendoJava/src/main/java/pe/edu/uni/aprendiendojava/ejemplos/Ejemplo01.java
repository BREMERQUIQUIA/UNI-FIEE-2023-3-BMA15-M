/*
Encontrar el promedio de un estudiante.
Son 4 notas y se elimina la menor.
Aprueba si el promedio es mayor o igual a 14.

 */
package pe.edu.uni.aprendiendojava.ejemplos;

import java.util.Arrays;

public class Ejemplo01 {

	public static void main(String[] args) {
		// Variables
		int nota1, nota2, nota3, nota4;
		int menorNota, promedio;
		String condicion;

		// Datos
		nota1 = 15;
		nota2 = 20;
		nota3 = 18;
		nota4 = 8;

		// Proceso
		menorNota = obtenerMenorNotaD(nota1, nota2, nota3, nota4);
		promedio = (nota1 + nota2 + nota3 + nota4 - menorNota) / 3;
		condicion = (promedio >= 14) ? "Aprobado" : "Desaprobado";
		
		// Reporte
		System.out.println("la menor nota es:" + menorNota);
		System.out.println("el promedio es: " + promedio);
		System.out.println("el alumno fue " + condicion);

	}

	private static int obtenerMenorNotaA(int nota1, int nota2, int nota3, int nota4) {
		//Variables
		int menor;
		//Proceso
		menor=nota1; // Punto de apoyo
		menor = (nota2<menor)?nota2:menor;
		menor = (nota3<menor)?nota3:menor;
		menor = (nota4<menor)?nota4:menor;
		//Reporte
		return menor;
	}
	
	/**
	 * Desarrollado por Aliaga
	 * @param arreglo
	 * @return 
	 */
	private static int obtenerMenorNotaB(int ... arreglo) {
		//Variables
		int menor;
		//Proceso
		menor= Integer.MAX_VALUE;
		for(int i=0;i<arreglo.length;i++){
			if(arreglo[i]<menor){
				menor=arreglo[i];
			}
		}
		//Reporte
		return menor;
	}
	
	private static int obtenerMenorNotaC(int ... arreglo) {
		//Variables
		int menor;
		//Proceso
		Arrays.sort(arreglo);
		menor = arreglo[0];
		//Reporte
		return menor;
	}
	
	private static int obtenerMenorNotaD(int ... arreglo) {
		//Variables
		int menor;
		//Proceso
		menor = Arrays.stream(arreglo).min().getAsInt();
		//Reporte
		return menor;
	}
}
