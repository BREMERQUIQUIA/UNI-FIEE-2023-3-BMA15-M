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
public class Prueba2 {
    public static void main(String[] args) {
        //Variables
        double A, B, C, perimetro;
        
        //Datos
        A = 7;
        B = 13;
        C = 9;
        
        //Proceso
        TriangleService triangle = new TriangleService();
        perimetro = triangle.perimetro(A, B, C);
        
        //Reporte
        System.out.println("El perimetro del triangulo es: " + perimetro);
    }
}
