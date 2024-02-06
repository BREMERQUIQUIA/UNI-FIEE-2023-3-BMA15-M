/*
 * VectorService  01/02/24
 * 
 * Copyright ® BMA15-2023-3
 * All rights reserved.
 */
package pe.edu.uni.proy.espinoza.service;

import java.util.Arrays;
import java.util.Random;

/**
 * @version java 21.0.2 2024-01-16 LTS
 * @author Emerson Espinoza <emerson.espinoza.s@uni.pe>
 */
public class VectorService {

    private int[] vector3;
    private int[] vector5;

    public VectorService(int n) {
        //Variables
        int cont3 = 0, cont5 = 0;
        int numeroRandom3, numeroRandom5;
        Random rnd = new Random();

        //Proceso
        vector3 = new int[n];
        vector5 = new int[n];

        while (cont3 < n && n > 0) {
            numeroRandom3 = 10 + rnd.nextInt(41);

            if (numeroRandom3 % 3 == 0) {
                vector3[cont3] = numeroRandom3;
                cont3++;
            }
        }

        while (cont5 < n && n > 0) {
            numeroRandom5 = 10 + rnd.nextInt(41);

            if (numeroRandom5 % 5 == 0) {
                vector5[cont5] = numeroRandom5;
                cont5++;
            }
        }

    }

    public int[] getVector3() {
        return vector3;
    }

    public int[] getVector5() {
        return vector5;
    }

    public int[] vectorNoComun() {
        //Variables
        int[] array3;
        int[] array5;
        int[] array;
        int[] array_noComun;
        int cont=0;
        
        //Proceso
        array3=Arrays.copyOf(vector3, vector3.length);
        array5=Arrays.copyOf(vector5, vector5.length);
        
        for(int i=0;i<array3.length;i++){
            for(int j=0;j<array5.length;j++){
                if(i!=j && array3[i]==array5[j]){
                    array3[i]=0;//los valores del array3 que estan en array5 se hacen ceros
                }
            }
        }
        
        for(int i=0;i<array5.length;i++){
            for(int j=0;j<array3.length;j++){
                if(i!=j && array5[i]==array3[j]){
                    array5[i]=0;//los valores del array5 que estan en array3 se hacen ceros
                }
            }
        }
        
        array = new int[array3.length+array5.length];
        
        for(int i=0;i<array3.length;i++){
            if(array3[i]!=0){
                array[cont] = array3[i];//pasamos los valores no nulos de array3 a array
                cont++;
            }
        }
        
        for(int i=0;i<array5.length;i++){
            if(array5[i]!=0){
                array[cont] = array5[i];//pasamos los valores no nulos de array5 a array
                cont++;
            }
        }
        
        cont = 0;
        
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(i!=j && array[i]==array[j] && array[i]!=0 && array[j]!=0)
                    array[i] = 0;//asiganmos el valor de cero a los datos repetidos
            }
        }
        
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                cont++;//contamos cuantos valores nulos hay
            }
        }
        
        array_noComun = new int[array.length-cont];//el tamaño sera el total menos los nulos
        cont = 0;
        
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array_noComun[cont] = array[i];//le asignamos los no nulos
                cont++;
            }
        }
        
        
        //Reporte
        return array_noComun;
    }

    public int[] vectorUnion() {
        //Variables
        int[] array3;
        int[] array5;
        int[] array;
        int[] array_union;
        int cont = 0;

        //Proceso
        array3 = Arrays.copyOf(vector3, vector3.length);
        array5 = Arrays.copyOf(vector5, vector5.length);

        array = new int[array3.length + array5.length];

        for (int i = 0; i < array3.length; i++) {
            array[cont] = array3[i]; //Guardamos los datos del arreglo3 en array
            cont++;
        }

        for (int i = 0; i < array5.length; i++) {
            array[cont] = array5[i]; //Guardamos los datos del arreglo5 en array
            cont++;
        }

        cont = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    array[i] = 0;//Hacemos ceros todos los valores repetidos
                    cont++;//contamos cuantos valores repetidos hay
                }
            }
        }

        array_union = new int[array.length - cont];//la union sera el total de datos menos los repetidos
        cont = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array_union[cont] = array[i];//guardamos en array_union los valores sin repetir
                cont++;
            }
        }

        //Reporte
        return array_union;
    }

}
