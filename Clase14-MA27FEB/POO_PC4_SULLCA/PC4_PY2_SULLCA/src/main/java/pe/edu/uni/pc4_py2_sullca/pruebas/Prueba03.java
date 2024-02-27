package pe.edu.uni.pc4_py2_sullca.pruebas;

import pe.edu.uni.pc4_py2_sullca.service.Coordenadas;
import pe.edu.uni.pc4_py2_sullca.service.PuntoDto;

public class Prueba03 {

	public static void main(String[] args) {
		// Datos
		int n = 5;
		// Prueba
		Coordenadas service = new Coordenadas(n);
		System.out.println("------ Puntos generados ------");
		PuntoDto[] puntos = service.getPuntos();
		for (PuntoDto punto : puntos) {
			System.out.print("> " + punto + " // ");
			System.out.println("Cuadrante: " + punto.getCuadrante());
		}
		System.out.println("------ Puntos por cuadrante ------");
		int[] puntosPorCuadrante = service.cantPuntosPorCuadrante();
		System.out.println("Primer cuadrante: " + puntosPorCuadrante[0]);
		System.out.println("Segundo cuadrante: " + puntosPorCuadrante[1]);
		System.out.println("Tercer cuadrante: " + puntosPorCuadrante[2]);
		System.out.println("Cuarto cuadrante: " + puntosPorCuadrante[3]);
	}

}
