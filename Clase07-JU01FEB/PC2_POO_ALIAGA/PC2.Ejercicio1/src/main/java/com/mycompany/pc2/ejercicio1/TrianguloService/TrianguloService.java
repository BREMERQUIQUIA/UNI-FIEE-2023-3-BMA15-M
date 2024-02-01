package com.mycompany.pc2.ejercicio1.TrianguloService;

public class TrianguloService {

	public double semipe(double ladoA, double ladoB, double ladoC) {
		double semipe;
		semipe = (ladoA + ladoB + ladoC) / 2;
		return semipe;
	}

	public double area(double ladoA, double ladoB, double ladoC) {
		double area, semipe;
		//TrianguloService s = new TrianguloService();
		//semipe = s.semipe(ladoA, ladoB, ladoC);
		semipe = semipe(ladoA, ladoB, ladoC);
		area = Math.sqrt(semipe * (semipe - ladoA) * (semipe - ladoB) * (semipe - ladoC));
		return area;
	}

	public boolean veracidad(double ladoA, double ladoB, double ladoC) {
		return ladoA < ladoC + ladoB && ladoC < ladoA + ladoB && ladoB < ladoC + ladoA;
	}

}
