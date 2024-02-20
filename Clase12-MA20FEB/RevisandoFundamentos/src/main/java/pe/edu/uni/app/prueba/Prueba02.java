package pe.edu.uni.app.prueba;

import java.util.List;
import pe.edu.uni.app.dto.PuntoDto;
import pe.edu.uni.app.service.PlanoServiceV2;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		PlanoServiceV2 service = new PlanoServiceV2();
		
		service.add(5, 7);
		service.add(-5, -7);
		service.add(8.3, 6.2);
		service.add(10, -7);
		service.add(4, 3);
		service.add(20, 20);
		
		List<PuntoDto> puntos = service.getPuntos();
		for (PuntoDto punto : puntos) {
			System.out.println(punto);
		}
		
		
	}
}
