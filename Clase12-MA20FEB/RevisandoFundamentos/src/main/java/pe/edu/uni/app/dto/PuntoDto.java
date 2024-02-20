package pe.edu.uni.app.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class PuntoDto {
	
	private double x;
	private double y;
	private double distancia;
	private String cuadrante;

	public PuntoDto() {
		this(0, 0);
	}

	public PuntoDto(double x, double y) {
		this.x = x;
		this.y = y;
		this.distancia = 0;
		calcularDistancia();
		encontrarCuadrante();
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getDistancia() {
		return distancia;
	}

	private void calcularDistancia(){
		this.distancia = Math.sqrt(x*x + y*y);
	}

	@Override
	public String toString() {
		String texto = "(" + this.x + "," + this.y + ",";
		texto += this.cuadrante + "," + this.distancia  + ")";
		return texto;
	}

	private void encontrarCuadrante() {
		this.cuadrante = "NO SE";
		cuadrante = (this.x>0 && this.y>0)?"I":cuadrante;
		cuadrante = (this.x<0 && this.y>0)?"II":cuadrante;
		cuadrante = (this.x<0 && this.y<0)?"III":cuadrante;
		cuadrante = (this.x>0 && this.y<0)?"IV":cuadrante;
	}
	

	
}
