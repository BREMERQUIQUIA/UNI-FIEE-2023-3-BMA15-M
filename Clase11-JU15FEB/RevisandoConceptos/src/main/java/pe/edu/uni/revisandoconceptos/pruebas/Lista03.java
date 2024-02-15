package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.ArrayList;
import java.util.Comparator;
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
public class Lista03 {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Lima");
		lista.add("Cuzco");
		lista.add("Tarma");
		lista.add("Londres");
		lista.add("CDMx");
		lista.add("Arequipa");
		
		for (Object bean : lista) {
			System.out.println(bean);
		}
		
		lista.sort(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		System.out.println("------------------------------------");
		for (Object bean : lista) {
			System.out.println(bean);
		}
	}

}
