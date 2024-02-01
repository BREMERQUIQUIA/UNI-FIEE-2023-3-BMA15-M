package pe.edu.uni.pc2_py2_sullca.pruebas;

import pe.edu.uni.pc2_py2_sullca.service.Matematica;

public class Prueba02 {

	public static void main(String[] args) {
		Matematica mate = new Matematica();
		System.out.println("0! = " + mate.factorial(0));
		System.out.println("1! = " + mate.factorial(1));
		System.out.println("3! = " + mate.factorial(3));
		System.out.println("5! = " + mate.factorial(5));
	}
}
