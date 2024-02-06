package pe.edu.uni.aprendiendojava.service;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class MateService {

	public boolean esPerfecto(int numero) {
		if (numero <= 1) {
			return false;
		}
		return (numero == sumaDivisores(numero));
	}

	public boolean sonAmigos(int numero1, int numero2) {
		if (numero1 <= 1 || numero2 <= 1) {
			return false;
		}
		// Variables
		boolean cond1, cond2, condFinal;
		// Proceso
		cond1 = (numero1 == sumaDivisores(numero2));
		cond2 = (numero2 == sumaDivisores(numero1));
		condFinal = (cond1 && cond2);
		// Reporte
		return condFinal;
	}

	private int sumaDivisores(int numero) {
		//variables
		int suma;
		//datos
		suma = 0;
		for (int i = 1; i <= (numero / 2); i++) {
			if (numero % i == 0) {
				suma += i;
			}
		}
		return suma;
	}

	public double sumatoria(double x, int n) {
		// Vriables
		double suma, signo, numerador, denominador, termino;
		// Proceso
		suma = 0.0;
		for (int i = 0; i <= n; i++) {
			signo = Math.pow(-1, i);
			numerador = Math.pow(x, 2 * i + 1);
			denominador = 2*i + 1;
			termino = signo * numerador / denominador;
			suma += termino;
		}
		// Reporte
		return suma;
	}

}
