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
public abstract class ComprobanteAbstract {

	protected static final double IGV = 0.18;
	protected static final double SERVICIO = 0.10;

	public abstract ItemDto[] procesar(double total);

	protected double to2Dec(double valor) {
		valor = Math.round(valor * 100) / 100;
		return valor;
	}

}
