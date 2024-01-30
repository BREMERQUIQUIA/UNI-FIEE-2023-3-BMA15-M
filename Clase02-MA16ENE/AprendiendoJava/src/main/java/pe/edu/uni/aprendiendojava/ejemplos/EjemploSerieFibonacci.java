package pe.edu.uni.aprendiendojava.ejemplos;

public class EjemploSerieFibonacci {

	public static void main(String[] args) {
		// Variables
		int n, suma, termino;
		String serie;
		// Datos
		n = 4;
		// Proceso
		serie = obtenerSerie(n);
		suma = obtenerSuma(n);
		termino = obtenerTermino(n);
		// Reporte
		System.out.println("n = " + n);
		System.out.println("Serie: " + serie);
		System.out.println("Suma: " + suma);
		System.out.println("Termino: " + termino);

	}

	private static String obtenerSerie(int n) {
		// Primer analisis
		if (n == 1) {
			return "0";
		}
		if (n == 2) {
			return "0, 1";
		}
		// Variables
		String serie;
		int n1, n2, n3;
		// Proceso
		serie = "0, 1";
		n1 = 0;
		n2 = 1;
		for (int i = 3; i <= n; i++) {
			n3 = n1 + n2;
			serie += ", " + n3;
			n1 = n2;
			n2 = n3;
		}
		// Reporte
		return serie;
	}

	private static int obtenerSuma(int n) {
		//variables
		int suma, fib1, fib2, i, temp;
		//proceso
		if (n <= 0) {
			return 0;
		}
		suma = 0;
		fib1 = 0;
		fib2 = 1;
		for (i = 1; i <= n; i++) {
			suma += fib1;
			temp = fib1 + fib2;
			fib1 = fib2;
			fib2 = temp;
		}
		return suma;
	}

	private static int obtenerTermino(int n) {
		//variables
		int termino, fib1, fib2, i, temp;
		//proceso
		if (n <= 0) {
			return 0;
		}
		termino = 0;
		fib1 = 0;
		fib2 = 1;
		for (i = 1; i <= n; i++) {
			termino = fib1;
			temp = fib1 + fib2;
			fib1 = fib2;
			fib2 = temp;
		}
		return termino;
	}
}
