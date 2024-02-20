package pe.edu.uni.app.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.uni.app.dto.PuntoDto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class PlanoServiceV2 {
	
	private static List<PuntoDto> puntos;
	
	static {
		puntos = new ArrayList<>();
	}
	
	public void add(PuntoDto punto){
		puntos.add(punto);
	}
	
	public void add(double x, double y){
		PuntoDto punto = new PuntoDto(x, y);
		puntos.add(punto);
	}

	public List<PuntoDto> getPuntos() {
		return puntos;
	}
	
	public PuntoDto getPuntoMasCerca(){
		PuntoDto punto = null;
		
		return punto;
	}

}
