/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.pc2py2quispe.prueba;

import pe.edu.uni.pc2py2quispe.service.MateService;

/**
 *
 * @author PROFESOR
 */
public class Prueba1 {

    public static void main(String[] args) {
        //Variables
        double x, potencia;
        int n;

        //Datos
        x = 0.9;
        n = -2;

        //Proceso
        MateService mate = new MateService();
        potencia = mate.potencia(x, n);

        //Reporte
        System.out.println("La potencia es: " + potencia);
    }

}
