package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.EstudianteDto;

public class Prueba02 {

	public static void main(String[] args) {
		
		EstudianteDto dto = new EstudianteDto(2000, "Carla", 15, 17, 16, "Aprobado");
		
		System.out.println("Texto: " + dto);
		
	}
	
}
