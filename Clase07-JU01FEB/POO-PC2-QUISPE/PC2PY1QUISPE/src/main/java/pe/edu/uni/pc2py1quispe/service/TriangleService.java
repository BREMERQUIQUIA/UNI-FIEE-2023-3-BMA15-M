/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.pc2py1quispe.service;

/**
 *
 * @author PROFESOR
 */
public class TriangleService {
    public String esValido(double A, double B, double C){
        //Variables
        boolean val;
        String rpta;
        //Proceso
        val = (A + B > C ) && (A + C > B ) && (C + B > A ) && A > 0 && B > 0 && C > 0;
        rpta = val? "VALIDO":"INVALIDO";
        //Reporte
        return rpta;
    }
    
    public double perimetro(double A, double B, double C){
        //Variables
        double perimetro;
        
        //Proceso
        perimetro = A + B + C;
        
        //Reporte
        return perimetro;
    }
    
    public double area(double A, double B, double C){
        //Variables
        double p, area;
        
        //Proceso
        p = (A + B + C) / 2.0;
        area = Math.sqrt(p * (p - A) * (p - C) * (p - B));
        
        //Reporte
        return area;
        
        
    }
}
