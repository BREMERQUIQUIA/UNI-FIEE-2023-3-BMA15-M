package pe.edu.uni.tienda.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog www.desarrollasoftware.com
 */
public class VentaDto {

	private String cliente;
	private String categoria;
	private String producto;
	private double precio;
	private int cantidad;
	private double importe;

	public VentaDto() {
	}

	public VentaDto(String cliente, String categoria, String producto, double precio, int cantidad) {
		this.cliente = cliente;
		this.categoria = categoria;
		this.producto = producto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.importe = precio * cantidad;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
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
		String texto = "{" + this.cliente + ", " + this.categoria;
		texto += ", " + this.producto + ", " + this.precio;
		texto += ", " + this.cantidad + ", " + this.importe + "}";
		return texto;	
	}

	

}
