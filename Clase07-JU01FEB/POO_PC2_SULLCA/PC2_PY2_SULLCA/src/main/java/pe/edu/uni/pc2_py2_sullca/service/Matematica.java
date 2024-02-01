package pe.edu.uni.pc2_py2_sullca.service;

public class Matematica {

	public Matematica() {
	}

	public double potencia(double x, int n) {
		double resultado = 1;
		for (int i = 0; i < n; i++) {
			resultado *= x;
		}
		return resultado;
	}

	public long factorial(int n) {
		long resultado = 1;
		while (n > 1) {
			resultado *= n--;
		}
		return resultado;
	}

	public double serie(double x, int n) {
		double resultado = 0;
		for (int i = 0; i < n; i++) {
			int signo = (i % 2 == 0) ? 1 : -1;
			resultado += signo * potencia(x, 2 * i + 1) / (double) factorial(2 * i + 1);
		}
		return resultado;
	}
}
