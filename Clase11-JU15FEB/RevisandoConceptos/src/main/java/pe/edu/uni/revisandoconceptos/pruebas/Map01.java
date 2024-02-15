package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Map01 {


    public static void main(String[] args) {
        
		 Map datos = new HashMap();
		 
		 datos.put("01", "Lima");
		 datos.put("02", "Cusco");
		 datos.put("03", "Arequipa");
		 datos.put("04", "Trujillo");
		 datos.put("01", "Chiclayo");
		 
		 for(Object key: datos.keySet()){
			 System.out.println(key + " - " + datos.get(key));
		 }
    }

}
