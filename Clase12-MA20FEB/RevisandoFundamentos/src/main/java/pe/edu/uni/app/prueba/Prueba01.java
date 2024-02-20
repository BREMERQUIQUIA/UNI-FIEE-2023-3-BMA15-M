package pe.edu.uni.app.prueba;

import pe.edu.uni.app.service.PlanoServiceV1;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {

	public static void main(String[] args) {
		
		PlanoServiceV1 service = new PlanoServiceV1();
		
		service.add(5, 7);
		service.add(-5, -7);
//		service.add(8.3, 6.2);
//		service.add(10, -7);
//		service.add(4, 3);
//		service.add(20, 20);
		
		double[][] puntos = service.getPuntos();
		for (double[] punto : puntos) {
			System.out.println("x=" + punto[0] + ", y=" + punto[1]);
		}
		
		
	}
}
