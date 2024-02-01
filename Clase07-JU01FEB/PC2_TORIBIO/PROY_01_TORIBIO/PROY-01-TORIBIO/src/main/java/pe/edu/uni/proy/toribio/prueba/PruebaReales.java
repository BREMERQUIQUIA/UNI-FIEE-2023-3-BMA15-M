/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.proy.toribio.prueba;

import pe.edu.uni.proy.toribio.servicio.ServiceValoresReales;

/**
 *
 * @author Toribio
 */
public class PruebaReales {

	public static void main(String[] args) {

		//variables
		int A, B, C;
		float det, val1, val2;
		String condicion;

		//datos
		A = 1;
		B = -3;
		C = 15;

		//proceso
		ServiceValoresReales service = new ServiceValoresReales();

		det = service.hallarDeterminante(A, B, C);
		val1 = (det >= 0) ? service.hallarValor1(B, A, det) : 0;
		val2 = (det >= 0) ? service.hallarValor2(B, A, det) : 0;
		condicion = (det >= 0) ? "REALES" : "IMAGINARIOS";

		//reporte
		System.out.println("El determinante es : " + det);
		System.out.println("X1:" + val1);
		System.out.println("X2:" + val2);
		System.out.println("Los soluciones de la ecuacion son " + condicion);
	}

}
