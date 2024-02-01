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
public class Prueba3 {
    public static void main(String[] args) {
        //Variables
        double x, serie;
        int n;
        
        //Datos
        x = 2.5;
        n = 3;
        
        //Proceso
        MateService mate = new MateService();
        serie = mate.serie(x, n);
        
        //Reporte
        System.out.println("El valor de la serie es: " + serie);
    }
}
