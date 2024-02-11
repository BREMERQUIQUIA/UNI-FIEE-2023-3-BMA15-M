package pe.edu.uni.ventaapp.prueba;

import pe.edu.uni.ventaapp.dto.ItemDto;
import pe.edu.uni.ventaapp.service.BoletaService;
import pe.edu.uni.ventaapp.service.ComprobanteAbstract;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class Prueba02 {
	
	public static void main(String[] args) {
		// Datos
		double total = 118.0;
		// Proceso
		ComprobanteAbstract bean = new BoletaService();
		ItemDto[] repo = bean.procesar(total);
		// Reporte
		for (ItemDto dto : repo) {
			System.out.println(dto.getConcepto() + " - " + dto.getValor());
		}
	}

}
