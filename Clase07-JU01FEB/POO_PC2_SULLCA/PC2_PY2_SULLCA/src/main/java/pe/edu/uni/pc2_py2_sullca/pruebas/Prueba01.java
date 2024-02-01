package pe.edu.uni.pc2_py2_sullca.pruebas;

import pe.edu.uni.pc2_py2_sullca.service.Matematica;

public class Prueba01 {

	public static void main(String[] args) {
		Matematica mate = new Matematica();
		System.out.println("2^0 = " + mate.potencia(2, 0));
		System.out.println("3^1 = " + mate.potencia(3, 1));
		System.out.println("4^3 = " + mate.potencia(4, 3));
		System.out.println("5^2 = " + mate.potencia(5, 2));
	}
}
