/*
Desarrollar un programa que permita determinar si un número es par o impar.
*/

package pe.edu.uni.aprendiendojava.ejemplos;

import java.util.Random;

public class Ejemplo02 {
	
	public static void main(String[] args) {
		// Variables
		int numero;
		String mensaje;
		Random random = new Random();
		// Datos
		numero = random.nextInt(100) + 1;
		// Proceso
		mensaje=(numero%2==0)? "par":"impar";

		// Reporte
		System.out.println("el numero: "+numero);
		System.out.println("Es: "+mensaje);
		
	}

}
