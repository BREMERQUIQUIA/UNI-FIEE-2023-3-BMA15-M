package pe.edu.uni.pc4_py2_sullca.pruebas;

import pe.edu.uni.pc4_py2_sullca.service.Coordenadas;
import pe.edu.uni.pc4_py2_sullca.service.PuntoDto;

public class Prueba02 {

	public static void main(String[] args) {
		// Datos
		int n = 5;
		// Prueba
		Coordenadas service = new Coordenadas(n);
		System.out.println("------ Puntos generados ------");
		PuntoDto[] puntos = service.getPuntos();
		for (PuntoDto punto : puntos) {
			System.out.print("> " + punto + " // ");
			System.out.println("Dist: " + punto.getDistancia());
		}
		System.out.println("> Punto más lejos: " + service.getPuntoMasLejos());
		System.out.println("> Punto más cerca: " + service.getPuntoMasCerca());
	}

}
