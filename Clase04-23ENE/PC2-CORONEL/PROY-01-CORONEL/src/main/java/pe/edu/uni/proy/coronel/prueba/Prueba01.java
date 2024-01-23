package pe.edu.uni.proy.coronel.prueba;

import pe.edu.uni.proy.coronel.dto.ItemDto;
import pe.edu.uni.proy.coronel.service.MateService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		int n;
		ItemDto[] tabla;
		// Datos
		n = 5;		
		// Proceso
		MateService mateService = new MateService();
		tabla = mateService.generaTablaMultiplicar(n);
		// Reporte
		System.out.println("Tabla del " + n);
		for (ItemDto dto : tabla) {
			System.out.print("" + dto.getNum1());
			System.out.print(" x " + dto.getNum2());
			System.out.println(" = " + dto.getResultado());
		}
	}
}
