package pe.edu.uni.pc4_py1_sullca.pruebas;

import pe.edu.uni.pc4_py1_sullca.service.FiguraAbstract;
import pe.edu.uni.pc4_py1_sullca.service.Triangulo;

public class Prueba02 {

    public static void main(String[] args) {
        // Datos
        double base = 10;
        double altura = 5;
        // Prueba
        FiguraAbstract fig = new Triangulo(base, altura);
        System.out.println("------ Triángulo ------");
        System.out.println("> Base: " + base);
        System.out.println("> Altura: " + altura);
        System.out.println("> Área: " + fig.calcularArea());
    }

}
