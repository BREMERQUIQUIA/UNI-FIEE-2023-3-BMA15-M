package pe.edu.uni.proy.coronel.service;

import pe.edu.uni.proy.coronel.dto.ItemDto;

public class MateService {

	public ItemDto[] generaTablaMultiplicar(int n){
		// Variables
		ItemDto[] tabla = new ItemDto[12];
		int resultado;
		// Proceso
		for(int i=1; i<=12; i++){
			resultado = i * n;
			ItemDto dto = new ItemDto(n, i, resultado);
			tabla[i-1] = dto;
		}
		// Reporte
		return tabla;
	}
	
	
}
