/*
*   Ejercicio03
*
*   Encontrar impar/par
*
*   java 17.0.9 2023-10-17 LTS
*   Java(TM) SE Runtime Environment (build 17.0.9+11-LTS-201)
*   Java HotSpot(TM) 64-Bit Server VM (build 17.0.9+11-LTS-201, mixed mode, sharing)
*   
*   16 January 2024
*
*   Copyright ® 2024
*   Autor: Emerson Espinoza
 */
package pe.edu.uni.aprendiendojava.ejemplos;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Variables
		int nota;
		String calificacion;
		Random rnd = new Random();
		
		//Datos
		nota = rnd.nextInt(21);//genera numero entre [0,20]

		//Procedimiento
		calificacion = calculaCalificacion(nota);

		//Registro
		System.out.println("nota: " + nota);
		System.out.println(calificacion);
	}

	private static String calculaCalificacion(int nota) {
		//Variable
		String[] calificacion = {"PESIMA", "BAJA", "REGULAR", "BUENA", "EXCELENTE"};
		boolean[] condicion = {
			nota >= 0 && nota <= 5, 
			nota > 5 && nota <= 11,
			nota > 11 && nota <= 15,
			nota > 15 && nota <= 18, 
			nota > 18 && nota <= 20
		};
		int indice;
		//Proceso 
		indice = 0;
		for (int i = 0; i < condicion.length; i++) {
			if (condicion[i] == true) {
				indice = i;
			}
		}
		//Reporte
		return calificacion[indice];
	}
}
