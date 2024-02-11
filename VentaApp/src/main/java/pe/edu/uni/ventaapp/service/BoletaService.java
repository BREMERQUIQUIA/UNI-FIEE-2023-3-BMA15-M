package pe.edu.uni.ventaapp.service;

import pe.edu.uni.ventaapp.dto.ItemDto;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class BoletaService extends ComprobanteAbstract {

	@Override
	public ItemDto[] procesar(double total) {
		// Variables
		double servicio, totalGeneral;
		// Proceso
		servicio = total * SERVICIO;
		totalGeneral = total + servicio;
		// Reporte
		ItemDto[] repo = {
			new ItemDto("Total", total),
			new ItemDto("Servicio", servicio),
			new ItemDto("Total general", totalGeneral),
		};
		return repo;
	}

}
