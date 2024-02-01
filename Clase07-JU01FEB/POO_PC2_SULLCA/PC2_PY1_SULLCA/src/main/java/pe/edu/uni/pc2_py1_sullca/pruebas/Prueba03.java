package pe.edu.uni.pc2_py1_sullca.pruebas;

import pe.edu.uni.pc2_py1_sullca.service.Triangulo;

public class Prueba03 {

    public static void main(String[] args) {
        // Datos
        double ladoA = 5;
        double ladoB = 4;
        double ladoC = 3;
        // Prueba
        Triangulo fig = new Triangulo(ladoA, ladoB, ladoC);
        System.out.println("Área del triángulo: " + fig.area());
    }
}
