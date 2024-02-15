package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Lista02 {

    public static void main(String[] args) {
        
		 List<String> lista = new ArrayList<>();
		 
		 lista.add("456");
		 lista.add("895.67");
		 lista.add("Gustavo");
		 lista.add("new Random()");
		 lista.add(1, "Claudia");
		 
		 for (Object bean : lista) {
			 System.out.println(bean);
		 }
    }

}
