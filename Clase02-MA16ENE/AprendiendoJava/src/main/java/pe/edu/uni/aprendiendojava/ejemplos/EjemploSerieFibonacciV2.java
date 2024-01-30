package pe.edu.uni.aprendiendojava.ejemplos;

import pe.edu.uni.aprendiendojava.dto.RepoDto;

public class EjemploSerieFibonacciV2 {

	public static void main(String[] args) {
		// Variables
		int n, suma, termino;
		RepoDto dto;
		// Datos
		n = 3;
		// Proceso
		dto = procesarSerie(n);
		// Reporte
		System.out.println("n = " + n);
		System.out.println("Serie: " + dto.getSerie());
		System.out.println("Suma: " + dto.getSuma());
		System.out.println("Termino: " + dto.getTermino());

	}

	private static RepoDto procesarSerie(int n) {
		// Variables
		String serie;
		int suma, termino;
		int n1, n2, n3;
		// Proceso
		serie = "";
		n1 = 0;
		n2 = 1;
		suma = 0;
		termino = 0;
		for (int i = 1; i <= n; i++) {
			serie += n1 + " ";
			suma  += n1;
			termino = n1;
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		// Reporte
		RepoDto dto = new RepoDto(serie, suma, termino);
		return dto;
	}

}
