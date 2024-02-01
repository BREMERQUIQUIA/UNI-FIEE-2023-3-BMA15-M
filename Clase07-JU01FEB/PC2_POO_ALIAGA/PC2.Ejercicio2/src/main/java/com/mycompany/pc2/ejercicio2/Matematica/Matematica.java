/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pc2.ejercicio2.Matematica;

/**
 *
 * @author PROFESOR
 */
public class Matematica {

    public double potencia(double x, int n) {
        //Variable
        double potencia;
        //Datos
        potencia = 1;
        //Proceso
        if (x > 0) {
            potencia = x;
            for (int i = 0; i <n; i++) {
                potencia *= x;
            }
        }
        //Reporte
        return potencia;
    }

    public long factorial(int n) {
        //Variable
        long factorial;
        //Datos
        factorial = 1;
        //Proceso
        while (n > 0) {
            factorial *= n;
            n--;
        }
        return factorial;
    }

    public double serie(double x, int n) {
        //Variable
        double seriesita, serie;
        //Datos
        seriesita = 0;
        serie = x;
        //Proceso
        for (int i = 2; i <= n; i++) {
            seriesita = potencia(x, 2 * i - 1) / factorial(2 * i - 1);
            if (i % 2 == 0) {
                serie = serie - seriesita;
            } else {
                serie = serie + seriesita;
            }
        }

        return serie;
    }

}
