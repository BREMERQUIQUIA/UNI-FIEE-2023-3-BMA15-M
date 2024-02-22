package pe.edu.uni.tienda.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class ResumenDto {

	private String concepto;
	private int cantidad;
	private double importe;

	public ResumenDto() {
	}

	public ResumenDto(String concepto, int cantidad, double importe) {
		this.concepto = concepto;
		this.cantidad = cantidad;
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		String texto = "{" + this.concepto + ", " + this.cantidad;
		texto += ", " + this.importe + "}";
		return texto;
	}

}
