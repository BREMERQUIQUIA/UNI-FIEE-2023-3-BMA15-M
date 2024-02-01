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
public class Prueba2 {
    public static void main(String[] args) {
        //Variables
        int n;
        long fact;
        
        //Datos
        n = 8;
        
        //Proceso
        MateService mate = new MateService();
        fact = mate.factorial(n);
        
        //Reporte
        System.out.println("El factorial es: " + fact);
    }
}
