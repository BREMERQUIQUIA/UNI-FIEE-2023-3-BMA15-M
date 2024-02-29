package pe.edu.uni.tienda.prueba;

import java.util.List;
import pe.edu.uni.tienda.dto.ProductoDto;
import pe.edu.uni.tienda.dto.VentaDto;
import pe.edu.uni.tienda.service.VentaService;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class Prueba02 {

	public static void main(String[] args) {
		
		VentaService service = new VentaService();
		
		ProductoDto[] productos = service.listaProductos();
		service.addVenta("JEFFERSON", productos[4].getNombre(), 3);
		service.addVenta("FERNANDO", productos[10].getNombre(), 4);
		
		List<VentaDto> ventas = service.listadoVentas();
		
		for (VentaDto venta : ventas) {
			System.out.println(venta);
		}
		
		
	}
}
