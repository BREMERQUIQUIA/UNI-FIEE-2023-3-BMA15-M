/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.pc2py1quispe.prueba;

import pe.edu.uni.pc2py1quispe.service.TriangleService;

/**
 *
 * @author PROFESOR
 */
public class Prueba1 {
    public static void main(String[] args) {
        //Variables
        double A, B, C;
        String rpta;
        
        //Datos
        A = 5;
        B = 8;
        C = -1;
        
        //Proceso
        TriangleService triangle = new TriangleService();
        rpta = triangle.esValido(A, B, C);
        
        //Reporte
        System.out.println("El triangulo es " + rpta);
    }
}
