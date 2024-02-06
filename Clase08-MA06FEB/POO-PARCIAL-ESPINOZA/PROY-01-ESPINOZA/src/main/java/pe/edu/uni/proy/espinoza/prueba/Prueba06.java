/*
 * Prueba06  01/02/24
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
public class Prueba06 {
    public static void main(String[] args) {
        //Variables
        double x, serie;
        int n;

        //Datos
        x = 1;
        n = 0;
        //Proceso
        MateService service = new MateService();
        serie = service.calculaSerie(x, n);

        //Reporte
        System.out.println("REPORTE");
        System.out.println("x: " + x);
        System.out.println("n: " + n);
        System.out.printf("serie: %.3f" , serie);
    }
   
}
