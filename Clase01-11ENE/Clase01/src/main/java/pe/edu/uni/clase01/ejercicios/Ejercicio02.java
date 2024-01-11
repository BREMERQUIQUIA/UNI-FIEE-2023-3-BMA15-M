package pe.edu.uni.clase01.ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Variables
		double pc, exp, exf, promedio;
		String condicion;

		//Datos
		pc = 10;
		exp = 14;
		exf = 19;

		//Procesos
		promedio = 0.4 * pc + 0.2 * exp + 0.4 * exf;
		condicion = (promedio >= 14.0) ? "Aprobado" : "Desaprobado";
		
		//Reporte
		System.out.println("-------------------------");
		System.out.println("Sus notas son:");
		System.out.println("-------------------------");
		System.out.println("Promedio de prácticas: " + pc);
		System.out.println("Examen parcial: " + exp);
		System.out.println("Examen final: " + exf);
		System.out.println("-------------------------");
		System.out.println("Promedio: " + promedio);
		System.out.println("Condicion: " + condicion);
	}
}
