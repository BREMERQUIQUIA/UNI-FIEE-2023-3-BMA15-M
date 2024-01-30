package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.ProductoDto;

public class Prueba04 {

	public static void main(String[] args) {
		
		ProductoDto dto = new ProductoDto(100, "Televisor", 3567.89, 200);
		
		System.out.println("Objeto: " + dto);
		
		
	}
	
}
