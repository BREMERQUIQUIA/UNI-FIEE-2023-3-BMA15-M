package pe.edu.uni.pc4_py1_sullca.pruebas;

import pe.edu.uni.pc4_py1_sullca.service.Circulo;
import pe.edu.uni.pc4_py1_sullca.service.FiguraAbstract;

public class Prueba03 {

    public static void main(String[] args) {
        // Datos
        double radio = 10;
        // Prueba
        FiguraAbstract fig = new Circulo(radio);
        System.out.println("------ Círculo ------");
        System.out.println("> Radio: " + radio);
        System.out.println("> Área: " + fig.calcularArea());
    }

}
