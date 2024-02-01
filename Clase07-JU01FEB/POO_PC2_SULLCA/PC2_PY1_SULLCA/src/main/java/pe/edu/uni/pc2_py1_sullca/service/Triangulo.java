package pe.edu.uni.pc2_py1_sullca.service;

public class Triangulo {

	private double ladoA;
	private double ladoB;
	private double ladoC;

	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public boolean esValido() {
		boolean c1, c2, c3, c4;
		c1 = ladoA < (ladoB + ladoC);
		c2 = ladoB < (ladoA + ladoC);
		c3 = ladoC < (ladoA + ladoB);
		c4 = (ladoA > 0) && (ladoB > 0) && (ladoC > 0);
		return c1 && c2 && c3 && c4;
	}

	public double perimetro() {
		return ladoA + ladoB + ladoC;
	}

	public double area() {
		double semiPer = perimetro() / 2.0;
		double t1, t2, t3;
		t1 = semiPer - ladoA;
		t2 = semiPer - ladoB;
		t3 = semiPer - ladoC;
		return Math.sqrt(t1 * t2 * t3 * semiPer);
	}
}
