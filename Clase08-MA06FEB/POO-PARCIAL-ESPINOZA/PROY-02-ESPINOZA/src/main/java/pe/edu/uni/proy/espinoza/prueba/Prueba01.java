/*
 * Prueba01  01/02/24
 * 
 * Copyright ® BMA15-2023-3
 * All rights reserved.
 */
package pe.edu.uni.proy.espinoza.prueba;

import java.util.Arrays;
import pe.edu.uni.proy.espinoza.service.VectorService;

/**
 * @version java 21.0.2 2024-01-16 LTS
 * @author Emerson Espinoza <emerson.espinoza.s@uni.pe>
 */
public class Prueba01 {

    public static void main(String[] args) {
        //Variables
        int tamaño;
        int[] vector3;
        int[] vector5;
        int[] vector_union;
        int[] vector_noComun;

        //Datos
        tamaño = 10;

        //Proceso
        VectorService service = new VectorService(tamaño);
        
        vector3 = service.getVector3();
        vector5 = service.getVector5();
        vector_union = service.vectorUnion();
        vector_noComun = service.vectorNoComun();

        //Reporte
        System.out.println("REPORTE");
        System.out.println("Vector3: " + Arrays.toString(vector3));
        System.out.println("Vector5: " + Arrays.toString(vector5));
        System.out.println("Vector Union: " + Arrays.toString(vector_union));
        System.out.println("Vector No Comun: " + Arrays.toString(vector_noComun));
    }
}
