package pe.edu.uni.aprendiendojava.prueba;

import pe.edu.uni.aprendiendojava.dto.EstudianteDto;

public class Prueba03 {

	public static void main(String[] args) {
		
		EstudianteDto dto = new EstudianteDto();
		
		// Datos
		dto.setId(20);
		dto.setNombre("Juan");
		dto.setExaParcial(20);
		dto.setExaFinal(20);
		dto.setPromedio(20);
		dto.setCondicion("RecontraAprobado");
		
		// Reporte
		System.out.println("REPORTE");
		System.out.println("ID: " + dto.getId());
		System.out.println("NOMBRE: " + dto.getNombre());
		System.out.println("EXA. PARCIAL: " + dto.getExaParcial());
		System.out.println("EXA. FINAL: " + dto.getExaFinal());
		System.out.println("PROMEDIO: " + dto.getPromedio());
		System.out.println("CONDICION: " + dto.getCondicion());
		
	}
	
}
