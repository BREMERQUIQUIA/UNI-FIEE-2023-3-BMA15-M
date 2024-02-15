package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Set01 {

    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
		  
		  conjunto.add("Chiclayo");
		  conjunto.add("Trujillo");
		  conjunto.add("Lima");
		  conjunto.add("Chiclayo");
		  conjunto.add("Trujillo");
		  conjunto.add("Puno");
		  
		  for(String dato: conjunto){
			  System.out.println(dato);
		  }
		  
    }

}
