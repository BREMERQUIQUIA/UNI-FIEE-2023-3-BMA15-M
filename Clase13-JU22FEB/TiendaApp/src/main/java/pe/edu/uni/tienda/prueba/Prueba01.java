package pe.edu.uni.tienda.prueba;

import java.util.List;
import pe.edu.uni.tienda.dto.VentaDto;
import pe.edu.uni.tienda.service.VentaService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		VentaService service = new VentaService();
		List<VentaDto> ventas = service.listadoVentas();
		
		for (VentaDto venta : ventas) {
			System.out.println(venta);
		}
		
		
	}
}
