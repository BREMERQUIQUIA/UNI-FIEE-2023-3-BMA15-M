
package pe.edu.uni.aprendiendojava.ejemplos;

import java.util.Random;

public class Ejemplo03MiguelDiaz {
public static void main(String[] args) {
        //Variables
        Random random=new Random();
        String mensaje = null;
        int numero;
        
        //Datos
        numero=random.nextInt(20)+1;
        
        //Proceso
        if((numero>=0)&&(numero<=5)){
            mensaje="PESIMA";
        }
        if((numero>5)&&(numero<=11)){
        mensaje="BAJA";
        }
        if((numero>11)&&(numero<=15)){
        mensaje="REGULAR";
        }
        if((numero>15)&&(numero<=18)){
        mensaje="BUENA";
        }
        if((numero>18)&&(numero<=20)){
        mensaje="EXCELENTE";
        }
        
      //Reporte
        System.out.println("Nota: "+numero);
        System.out.println("Condicion: "+mensaje);
    }
}
