package pe.edu.uni.pc4_py2_sullca.service;

import java.util.ArrayList;

public class Coordenadas {

	private final PuntoDto[] puntos;

	public Coordenadas(int n) {
		puntos = new PuntoDto[n];
		for (int i = 0; i < n; i++) {
			puntos[i] = new PuntoDto();
		}
	}

	public PuntoDto getPuntoMasLejos() {
		double maxDist = 0;
		PuntoDto puntoMasLejos = null;
		for (PuntoDto punto : puntos) {
			if (maxDist < punto.getDistancia()) {
				maxDist = punto.getDistancia();
				puntoMasLejos = punto;
			}
		}
		return puntoMasLejos;
	}

	public PuntoDto getPuntoMasCerca() {
		double minDist = Double.MAX_VALUE;
		PuntoDto puntoMasCerca = null;
		for (PuntoDto punto : puntos) {
			if (minDist > punto.getDistancia()) {
				minDist = punto.getDistancia();
				puntoMasCerca = punto;
			}
		}
		return puntoMasCerca;
	}

	public int[] cantPuntosPorCuadrante() {
		int[] cantPuntos = new int[4];
		for (int i = 0; i < 4; i++) {
			cantPuntos[i] = 0;
		}
		for (PuntoDto punto : puntos) {
			++cantPuntos[punto.getCuadrante() - 1];
		}
		return cantPuntos;
	}

	public ArrayList puntosPorCuadrante(int cuadrante) {
		if (1 <= cuadrante && cuadrante <= 4) {
			ArrayList<PuntoDto> lista = new ArrayList<>();
			for (PuntoDto punto : puntos) {
				if (punto.getCuadrante() == cuadrante) {
					lista.add(punto);
				}
			}
			return lista;
		}
		return null;
	}

	public PuntoDto[] getPuntos() {
		return puntos;
	}

}
