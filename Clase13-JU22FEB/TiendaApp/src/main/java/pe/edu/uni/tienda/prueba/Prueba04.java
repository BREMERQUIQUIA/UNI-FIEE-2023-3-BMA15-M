package pe.edu.uni.tienda.prueba;

import java.math.BigDecimal;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class Prueba04 {
	
	public static void main(String[] args) {
		
		double n1=567.45, n2=78.98, n3;
		n3 = n1 / n2;
		System.out.println("n3 = " + n3);
		
		BigDecimal m1, m2, m3;
		
		m1 = new BigDecimal(567.45);
		m2 = new BigDecimal(78.98);
		m3 = m1.divide(m2,2);
		
		System.out.println("m3 = " + m3.doubleValue());
		
	}

}
