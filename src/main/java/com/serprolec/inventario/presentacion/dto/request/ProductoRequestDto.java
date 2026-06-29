package com.serprolec.inventario.presentacion.dto.request;

import java.math.BigDecimal;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProductoRequestDto {

	private Long idProducto;
	@NotBlank
	private String codigoProducto;
	@NotBlank
	private String nombreProducto;
	@NotBlank
	private String descripcion;
	private Long idCategoria;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private Integer stockActual;
	private Integer stockMinimo;
	private String estado;
}
