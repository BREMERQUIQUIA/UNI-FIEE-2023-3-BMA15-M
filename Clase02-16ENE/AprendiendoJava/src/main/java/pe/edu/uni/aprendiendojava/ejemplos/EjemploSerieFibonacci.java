package pe.edu.uni.aprendiendojava.ejemplos;

public class EjemploSerieFibonacci {

	public static void main(String[] args) {
		// Variables
		int n, suma, termino;
		String serie;
		// Datos
		n = 5;
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
		return 0;
	}

	private static int obtenerTermino(int n) {
		return 0;
	}
}
