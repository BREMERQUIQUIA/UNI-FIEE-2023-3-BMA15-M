/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc2.ejercicio1.Prueba;

import com.mycompany.pc2.ejercicio1.TrianguloService.TrianguloService;

/**
 *
 * @author PROFESOR
 */
public class Prueba {

    public static void main(String[] args) {
        //Variables
        double ladoA, ladoB, ladoC, semipe, area;
        boolean veracidad;
        //Datos
        ladoA = 4;
        ladoB = 5;
        ladoC = 18;
        //Proceso
        TrianguloService s = new TrianguloService();
        semipe = s.semipe(ladoA, ladoB, ladoC);
        area = s.area(ladoA, ladoB, ladoC);
        veracidad = s.veracidad(ladoA, ladoB, ladoC);
        //Reporte
        System.out.println("Los lados del triangulo son: ");
        System.out.println("El lado A:" + ladoA + ".  EL lado B:" + ladoB + ".  El lado C:" + ladoC);
        if (veracidad == true) {
            System.out.println("El triangulo es valido");
            System.out.printf("El Area es : %.2f", area);
            System.out.println("");
            System.out.printf("El Perimetro es: %.2f", semipe * 2);
        } else {
            System.out.println("El triangulo no es valido");
        }
    }

}
