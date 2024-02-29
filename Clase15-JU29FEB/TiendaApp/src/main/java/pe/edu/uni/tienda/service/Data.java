package pe.edu.uni.tienda.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.uni.tienda.dto.ProductoDto;
import pe.edu.uni.tienda.dto.VentaDto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
class Data {

	private Data() {
	}

	static final String CATEGORIAS[];
	static final ProductoDto PRODUCTOS[];
	static List<VentaDto> ventas;

	static {
		CATEGORIAS = new String[]{
			"ABARROTES",
			"LACTEOS",
			"FRUTAS",
			"BEBIDAS"
		};
		PRODUCTOS = new ProductoDto[]{
			new ProductoDto("ABARROTES", "Lenteja", 5.50),
			new ProductoDto("ABARROTES", "Arroz", 4.50),
			new ProductoDto("ABARROTES", "Azucar", 4.20),
			new ProductoDto("LACTEOS", "Queso", 30.0),
			new ProductoDto("LACTEOS", "Leche", 5.50),
			new ProductoDto("LACTEOS", "Yogurt", 11.30),
			new ProductoDto("FRUTAS", "Mango Edward x kg", 9.70),
			new ProductoDto("FRUTAS", "Piña golden", 6.70),
			new ProductoDto("FRUTAS", "Pakay", 9.40),
			new ProductoDto("BEBIDAS", "Inka Kola 1Lt", 6.60),
			new ProductoDto("BEBIDAS", "Coca Cola 1Lt", 7.20),
			new ProductoDto("BEBIDAS", "Agua socosani 1Lt", 5.30)
		};
		ventas = new ArrayList<>();
		ventas.add(new VentaDto("EDUARDO", "ABARROTES","Arroz", 3.80, 10));
		ventas.add(new VentaDto("CAROLINE", "LACTEOS","Queso", 30.80, 2));
		ventas.add(new VentaDto("SERGIO", "BEBIDAS","Agua socosani 1Lt", 5.80, 3));
		ventas.add(new VentaDto("RICHARD", "FRUTAS","Pakay", 11.0, 4));
		ventas.add(new VentaDto("PERCY", "ABARROTES","Azucar", 4.10, 6));
		ventas.add(new VentaDto("MIGUEL", "FRUTAS","Piña golden", 5.80, 2));
		ventas.add(new VentaDto("YAZMIN", "BEBIDAS","Inka Kola 1Lt", 6.30, 2));
		ventas.add(new VentaDto("ADRIAN", "FRUTAS","Mango Edward x kg", 9.30, 4));
		ventas.add(new VentaDto("FLOWER", "LACTEOS","Leche", 5.80, 7));
	}

}
