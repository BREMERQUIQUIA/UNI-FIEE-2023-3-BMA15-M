package pe.edu.uni.aprendiendojava.ejemplos;

import java.util.Random;

public class Ejemplo03 {

	public static void main(String[] args) {
		//variable
		int nota;
		String mensaje;
		Random random = new Random();
		//Datos
		nota = random.nextInt(20) + 1;
		//proceso 
		mensaje = switch (nota) {
			case 0, 1, 2, 3, 4, 5 ->
				"Pesimo";
			case 6, 7, 8, 9, 10, 11 ->
				"Bajo";
			case 12, 13, 14, 15 ->
				"Regular";
			case 16, 17, 18 ->
				"Bueno";
			default ->
				"Excelente";
		};

		//reporte
		System.out.println("la nota " + nota);
		System.out.println("es: " + mensaje);
	}
}
