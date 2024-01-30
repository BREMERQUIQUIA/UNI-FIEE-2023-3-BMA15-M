package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.ProductoDto;

public class Prueba05 {

	public static void main(String[] args) {
		
		ProductoDto dto = new ProductoDto();
		
		dto.setId(20);
		dto.setNombre("Laptop");
		dto.setPrecio(5789.49);
		dto.setStock(50);
		
		System.out.println("Objeto: " + dto);
		
	}
	
}
