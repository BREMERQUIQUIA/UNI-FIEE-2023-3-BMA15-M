package pe.edu.uni.pc4_py1_sullca.service;

public class Circulo extends FiguraAbstract {

    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return radio * radio * Math.PI;
    }

}
