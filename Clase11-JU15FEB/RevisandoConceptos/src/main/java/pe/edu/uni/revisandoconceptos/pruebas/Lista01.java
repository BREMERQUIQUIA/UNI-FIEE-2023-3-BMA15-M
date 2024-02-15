package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Lista01 {

    public static void main(String[] args) {
        
		 List lista = new ArrayList();
		 
		 lista.add(456);
		 lista.add(895.67);
		 lista.add("Gustavo");
		 lista.add(new Random());
		 lista.add(1, "Claudia");
		 
		 for (Object bean : lista) {
			 System.out.println(bean);
		 }
    }

}
