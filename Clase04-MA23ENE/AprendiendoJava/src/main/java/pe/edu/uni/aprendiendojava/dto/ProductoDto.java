package pe.edu.uni.aprendiendojava.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductoDto {

	private int id;
	private String nombre;
	private double precio;
	private int stock;

}
