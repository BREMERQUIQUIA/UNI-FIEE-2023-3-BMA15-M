/*
 * Prueba02   01/02/24
 * 
 * Copyright ® BMA15-2023-3
 * All rights reserved.
 */
package pe.edu.uni.proy.espinoza.prueba;

import pe.edu.uni.proy.espinoza.service.MateService;

/**
 * @version java 21.0.2 2024-01-16 LTS
 * @author Emerson Espinoza <emerson.espinoza.s@uni.pe>
 */
public class Prueba02 {
    public static void main(String[] args) {
        //Variables
        int numero1;
        int numero2;
        int numero3;
        String isNumberPerfect;
        String isNumbersFriends;

        //Datos
        numero1 = 30;
        numero2 = 100;
        numero3 = 300;

        //Proceso
        MateService service = new MateService();
        
        isNumberPerfect = service.isNumberPerfect(numero1);
        isNumbersFriends = service.isNumbersFriends(numero2, numero3);

        //Reporte
        System.out.println("REPORTE");
        System.out.println("numero1: "+numero1);
        System.out.println("condicion: "+isNumberPerfect);
        System.out.println("");
        System.out.println("numero2: "+numero2);
        System.out.println("numero3: "+numero3);
        System.out.println("condicion: "+isNumbersFriends);
    }
}
