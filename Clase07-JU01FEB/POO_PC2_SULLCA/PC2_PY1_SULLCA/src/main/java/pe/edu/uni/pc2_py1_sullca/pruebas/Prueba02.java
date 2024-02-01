package pe.edu.uni.pc2_py1_sullca.pruebas;

import pe.edu.uni.pc2_py1_sullca.service.Triangulo;

public class Prueba02 {

    public static void main(String[] args) {
        // Datos
        double ladoA = 5;
        double ladoB = 5;
        double ladoC = 10;
        // Prueba
        Triangulo fig = new Triangulo(ladoA, ladoB, ladoC);
        System.out.println("Perímetro del triángulo: " + fig.perimetro());
    }
}
