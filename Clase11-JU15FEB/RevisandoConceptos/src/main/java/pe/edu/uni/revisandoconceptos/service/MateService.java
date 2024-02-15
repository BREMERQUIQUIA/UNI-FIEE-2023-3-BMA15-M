package pe.edu.uni.revisandoconceptos.service;

import pe.edu.uni.revisandoconceptos.excepciones.NotaFueraDeRango;
import pe.edu.uni.revisandoconceptos.spec.MateServiceSpec;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 * @cursos gcoronelc.github.io
 */
public class MateService implements MateServiceSpec{
	
	public int dividir(int n1, int n2) throws Exception{
		
		if(n2==0){
			throw new Exception("No se puede dividir por cero.");
		}
		
		return (n1/n2);
	}
	
	public void validarNota(int nota) throws Exception{
		
		if(nota<0 || nota > 20){
			throw new NotaFueraDeRango();
		}
		
	}

	@Override
	public long factorial(int n) {
		long f = 1;
		while(n>1){
			f *= n--;
		}
		return f;
	}

	@Override
	public double potencia(double base, int exponente) {
		double pot = 1;
		for(int i=1; i<=exponente; i++){
			pot *= base;
		}
		return pot;
	}

}
