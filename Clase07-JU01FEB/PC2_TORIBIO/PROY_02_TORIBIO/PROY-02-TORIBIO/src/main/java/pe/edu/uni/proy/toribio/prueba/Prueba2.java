/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proy.toribio.prueba;

import pe.edu.uni.proy.toribio.service.MathService;

/**
 *
 * @author Toribio
 */
public class Prueba2 {

    public static void main(String[] args) {

        //variables
        int n;
        double X, serie, potencia;
        long factor;

        //datos
        n = 10;
        X = 0.523599;

        //proceso
        MathService service = new MathService();
        factor = service.factorial(n);
        serie = service.hallarSerie(X, n);
        potencia = service.potencia(X, n);

        // reporte
        System.out.println("Sumando los " + n + " primeros datos con el numero " + X + " es: " + serie);
        System.out.println("factorial de " + 2 * n + " es :" + factor);
        System.out.println("El numero  " + X + " elevado a la  " + 2 * n + " es :" + potencia);

    }

}
