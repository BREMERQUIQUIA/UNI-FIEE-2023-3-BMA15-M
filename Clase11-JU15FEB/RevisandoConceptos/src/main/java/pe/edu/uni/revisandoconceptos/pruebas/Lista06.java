package pe.edu.uni.revisandoconceptos.pruebas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
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
public class Lista06 {

	public static void main(String[] args) {

		List<NotaDto> lista = new ArrayList<>();

		lista.add(new NotaDto("Claudia", 18));
		lista.add(new NotaDto("Jorge", 11));
		lista.add(new NotaDto("Gustavo", 15));
		lista.add(new NotaDto("Karla", 10));
		lista.add(new NotaDto("Aurora", 19));
		lista.add(new NotaDto("Cesar", 16));
		lista.add(new NotaDto("Alejandra", 15));

		for (Object bean : lista) {
			System.out.println(bean);
		}

		// Ordenar la lista por nota de menor a mayor
        Collections.sort(lista, (NotaDto nota1, NotaDto nota2) -> Integer.compare(nota2.getNota(), nota1.getNota()));

        System.out.println("----------------------------");
        // Imprimir la lista ordenada
        for (NotaDto nota : lista) {
            System.out.println(nota);
        }
		
	}

}
