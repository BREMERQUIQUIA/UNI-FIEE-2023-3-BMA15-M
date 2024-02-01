/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.uni.pc2py2quispe.service;

/**
 *
 * @author PROFESOR
 */
public class MateService {

	public double potencia(double x, int n) {
		//Variables
		double potencia = 1;
		//Proceso
		while (n != 0) {
			potencia *= x;
			n--;
		}
		//Reporte
		return potencia;
	}

	public long factorial(int n) {
		//Variables
		long factorial = 1;

		//Proceso
		while (n != 0) {
			factorial *= n;
			n--;
		}

		//Reporte
		return factorial;
	}

	public double serie(double x, int n) {
		//Variables
		double serie = 0;
		int i = 1;
		//Proceso
		while (n >= i) {
			serie += potencia(-1, (i - 1)) * potencia(x, (2 * i - 1)) / factorial(2 * i - 1);
			i++;
		}
		//Reporte
		return serie;
	}
}
