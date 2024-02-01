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
public class Prueba3 {
    public static void main(String[] args) {
        //Variables
        double area, A, B, C;
        
        //Datos
        A = 15;
        B = 13;
        C = 14;
        
        //Proceso
        TriangleService triangle = new TriangleService();
        area = triangle.area(A, B, C);
        
        //Reporte
        System.out.println("El area del triangulo es: " + area);
    }
}
