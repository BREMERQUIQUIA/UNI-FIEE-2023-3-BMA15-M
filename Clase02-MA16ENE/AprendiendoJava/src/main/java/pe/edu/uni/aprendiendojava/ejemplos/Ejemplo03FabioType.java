package pe.edu.uni.aprendiendojava.ejemplos;

import java.util.Random;

public class Ejemplo03FabioType {

	public static void main(String[] args) {
		//variable
		int nota;
		String mensaje;
		Random random = new Random();
		//Datos
		nota = random.nextInt(20) + 1;
		//proceso 
		mensaje="";
		mensaje = (nota >= 0 && nota <= 5) ? "pesimo" : mensaje;
		mensaje = (nota > 5 && nota <= 11) ? "bajo" :mensaje;
		mensaje = (nota > 11 && nota <= 15) ? "regular" :mensaje;
		mensaje = (nota > 15 && nota <= 18) ? "bueno" :mensaje;
		mensaje = (nota > 18 && nota <= 20) ? "excelente" :mensaje;
		//reporte
		System.out.println("la nota " + nota);
		System.out.println("es: " + mensaje);
	}
}
