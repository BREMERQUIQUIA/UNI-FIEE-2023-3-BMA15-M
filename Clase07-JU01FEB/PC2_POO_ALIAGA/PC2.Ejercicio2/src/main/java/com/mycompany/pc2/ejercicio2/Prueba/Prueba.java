/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc2.ejercicio2.Prueba;

import com.mycompany.pc2.ejercicio2.Matematica.Matematica;

/**
 *
 * @author PROFESOR
 */
public class Prueba {

    public static void main(String[] args) {

        //Variables
        double x, serie;
        int n;
        //Datos
        x = 1;
        n = 2;
        //Proceso
        Matematica m = new Matematica();
        serie = m.serie(x, n);
        //Reporte
        System.out.println("Los valores de");
        System.out.println("x:" + x);
        System.out.println("n:" + n);
        System.out.println("La serie es: " + serie);

    }
}
