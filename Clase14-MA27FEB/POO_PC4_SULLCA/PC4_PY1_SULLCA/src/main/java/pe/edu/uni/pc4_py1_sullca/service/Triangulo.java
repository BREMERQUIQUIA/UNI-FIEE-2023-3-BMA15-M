package pe.edu.uni.pc4_py1_sullca.service;

public class Triangulo extends FiguraAbstract {

	private final double base;
	private final double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura / 2.0;
	}

}
