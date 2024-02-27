package pe.edu.uni.pc4_py1_sullca.service;

public class Rectangulo extends FiguraAbstract {

	private final double base;
	private final double altura;

	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return base * altura;
	}

}
