package pe.edu.uni.pc2_py1_sullca.pruebas;

import pe.edu.uni.pc2_py1_sullca.service.Triangulo;

public class Prueba01 {

    public static void main(String[] args) {
        // Datos
        double ladoA = 5;
        double ladoB = 4;
        double ladoC = 1;
        // Prueba
        Triangulo fig = new Triangulo(ladoA, ladoB, ladoC);
        System.out.println("¿El triángulo es válido?");
        System.out.println("> Rpta: " + fig.esValido());
    }
}
