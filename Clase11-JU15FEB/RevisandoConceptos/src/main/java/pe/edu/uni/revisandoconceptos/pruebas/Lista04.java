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
public class Lista04 {

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

		Comparator<String> comparadorAlfabetico = Comparator.naturalOrder();
		lista.sort(comparadorAlfabetico);

		System.out.println("------------------------------------");
		for (Object bean : lista) {
			System.out.println(bean);
		}
	}

}
