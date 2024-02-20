package pe.edu.uni.app.service;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class PlanoServiceV1 {

	private static double[][] puntos;
	private static final int TAMANIO;
	private static int contPuntos;
	
	static {
		TAMANIO = 5;
		puntos = new double[TAMANIO][2];
		contPuntos = 0;
	}
	
	public int add(double x, double  y){
		if(contPuntos>=TAMANIO){
			return -1;
		}
		puntos[contPuntos][0] = x;
		puntos[contPuntos][1] = y;
		contPuntos++;
		return 1;
	}

	public double[][] getPuntos() {
		return puntos;
	}
	
		
}
