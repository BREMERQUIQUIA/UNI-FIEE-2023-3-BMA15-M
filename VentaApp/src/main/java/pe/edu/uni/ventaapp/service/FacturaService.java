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
public class FacturaService extends ComprobanteAbstract {

	@Override
	public ItemDto[] procesar(double total) {
		// Variables
		double consumo, impuesto, servicio, totalGeneral;
		// Proceso
		consumo = total / (1 + IGV);
		impuesto = total - consumo;
		servicio = total * SERVICIO;
		totalGeneral = total + servicio;
		// Reporte
		ItemDto[] repo = {
			new ItemDto("Consumo", consumo),
			new ItemDto("Impuesto", impuesto),
			new ItemDto("Total", total),
			new ItemDto("Servicio", servicio),
			new ItemDto("Total general", totalGeneral),
		};
		return repo;
	}

}
