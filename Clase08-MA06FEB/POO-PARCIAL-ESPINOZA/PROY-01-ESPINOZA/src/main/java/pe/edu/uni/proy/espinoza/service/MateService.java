package pe.edu.uni.proy.espinoza.service;

/**
 * @version java 21.0.2 2024-01-16 LTS
 * @author Emerson Espinoza <emerson.espinoza.s@uni.pe>
 */
public class MateService {

	public String isNumberPerfect(int num) {
		//Variables
		String condicion;
		boolean isTrue;
		int suma_divisores = 0, divisor;
		//Proceso
		num = Math.abs(num);
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				divisor = i;
				suma_divisores += divisor;
			}
		}
		isTrue = suma_divisores == num ? true : false;
		condicion = isTrue == true && num != 0 ? "ES PERFECTO" : "NO ES PERFECTO";
		//Reporte
		return condicion;
	}

	public String isNumbersFriends(int num1, int num2) {
		//Variables
		String condicion;
		boolean isTrue;
		int a, b, suma_div1, suma_div2;
		int div1, div2;
		//Asignacion
		suma_div1 = 0;
		suma_div2 = 0;
		a = Math.abs(num1);
		b = Math.abs(num2);
		//Proceso
		for (int i = 1; i < a; i++) {
			if (a % i == 0) {
				div1 = i;
				suma_div1 += div1;
			}
		}
		for (int i = 1; i < b; i++) {
			if (b % i == 0) {
				div2 = i;
				suma_div2 += div2;
			}
		}
		isTrue = suma_div1 == b && suma_div2 == a ? true : false;
		condicion = isTrue == true && num1 > 0 && num2 > 0 ? "SON AMIGOS" : "NO SON AMIGOS";
		//Reporte
		return condicion;
	}

	public double calculaSerie(double x, int n) {
		//Variables
		double serie = 0;
		int condicion;
		//Proceso
		condicion = n > 0 ? 1 : 0;
		switch (condicion) {
			case 1:
				for (int i = 0; i < n; i++) {
					serie += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / (2 * i + 1);
				}
				break;
			case 0:
				serie = 0;
				break;
		}
		//Reporte
		return serie;
	}
}
