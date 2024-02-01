package pe.edu.uni.pc2_py2_sullca.pruebas;

import pe.edu.uni.pc2_py2_sullca.service.Matematica;

public class Prueba03 {

    public static void main(String[] args) {
        // Datos
        double x = 0.523599;
        int n = 5;
        // Prueba
        Matematica mate = new Matematica();
        System.out.println(" x = " + x + " // " + "n = " + n);
        System.out.println("> Serie = " + mate.serie(x, n));
    }
}
