package pe.edu.uni.tienda.service;

import java.util.List;
import pe.edu.uni.tienda.dto.ProductoDto;
import pe.edu.uni.tienda.dto.ResumenDto;
import pe.edu.uni.tienda.dto.VentaDto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class VentaService {
	
	public ProductoDto[] listaProductos(){
		return Data.PRODUCTOS;
	}
	
	public List<VentaDto> listadoVentas(){
		return Data.ventas;
	}
	
	public void addVenta(String cliente, String producto, int cantidad){
		// Variables
		String categoria;
		double precio, importe;
		// Proceso
		categoria = "";
		precio = 0.0;
		for(ProductoDto dto: Data.PRODUCTOS){
			if(dto.getNombre().equals(producto)){
				categoria = dto.getCategoria();
				precio = dto.getPrecio();
				break;
			}
		}
		VentaDto venta = new VentaDto(cliente, categoria, producto, precio, cantidad);
		Data.ventas.add(venta);
	}

	public ResumenDto[] resumenPorCategoria(){
		// Variables
		ResumenDto[] resumen;
		// Proceso
		resumen = arregloResumenCategoria();
		for(VentaDto venta: Data.ventas){
			for(ResumenDto dto: resumen){
				if(venta.getCategoria().equals(dto.getConcepto())){
					dto.setCantidad(dto.getCantidad() + venta.getCantidad());
					dto.setImporte(dto.getImporte()+ venta.getImporte());
					break;
				}
			}
		}
		// Reporte
		return resumen;
	}

	private ResumenDto[] arregloResumenCategoria() {
		ResumenDto[] resumen;
		resumen = new ResumenDto[Data.CATEGORIAS.length];
		for(int i=0;i<Data.CATEGORIAS.length;i++){
			resumen[i] = new ResumenDto(Data.CATEGORIAS[i], 0, 0);
		}
		// Reporte
		return resumen;
	}
	
	
}
