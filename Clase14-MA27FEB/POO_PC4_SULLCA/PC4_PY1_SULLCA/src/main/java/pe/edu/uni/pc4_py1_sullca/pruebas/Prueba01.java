package pe.edu.uni.pc4_py1_sullca.pruebas;

import pe.edu.uni.pc4_py1_sullca.service.FiguraAbstract;
import pe.edu.uni.pc4_py1_sullca.service.Rectangulo;

public class Prueba01 {

    public static void main(String[] args) {
        // Datos
        double base = 10;
        double altura = 10;
        // Prueba
        FiguraAbstract fig = new Rectangulo(base, altura);
        System.out.println("------ Rectángulo ------");
        System.out.println("> Base: " + base);
        System.out.println("> Altura: " + altura);
        System.out.println("> Área: " + fig.calcularArea());
    }

}
