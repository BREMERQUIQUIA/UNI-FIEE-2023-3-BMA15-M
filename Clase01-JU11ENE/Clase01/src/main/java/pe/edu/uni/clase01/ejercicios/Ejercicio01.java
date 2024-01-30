package pe.edu.uni.clase01.ejercicios;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variables
		double precio, importe, impuesto, total;
		int cantidad;
		// Datos
		precio = 55.78;
		cantidad = 7;
		// Proceso
		total = precio * cantidad;
		importe = total / 1.18;
		impuesto = total - importe;
		// Reporte
		System.out.println("importe: " + importe);
		System.out.println("impuesto: " + impuesto);
		System.out.println("total: " + total);
	}

}
