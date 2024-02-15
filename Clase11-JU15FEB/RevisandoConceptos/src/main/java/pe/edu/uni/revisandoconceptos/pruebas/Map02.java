package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.HashMap;
import java.util.Map;
import pe.edu.uni.revisandoconceptos.dto.NotaDto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Map02 {


    public static void main(String[] args) {
        
		 Map<String,NotaDto> datos = new HashMap<>();
		 
		 datos.put("Gustavo", new NotaDto("Gustavo", 18));
		 datos.put("Karla", new NotaDto("Karla", 20));
		 datos.put("Augusto", new NotaDto("Augusto", 13));
		 datos.put("Doris", new NotaDto("Doris", 16));
		 datos.put("Alejandra", new NotaDto("Alejandra", 15));

		 
		 for(String key: datos.keySet()){
			 System.out.println(key + ": " + datos.get(key));
		 }
    }

}
