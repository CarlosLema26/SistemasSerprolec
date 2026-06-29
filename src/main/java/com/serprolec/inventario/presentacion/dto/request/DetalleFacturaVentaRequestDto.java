package com.serprolec.inventario.presentacion.dto.request;

import java.math.BigDecimal;
import lombok.Data;

@Data
public class DetalleFacturaVentaRequestDto {

	private Long idDetalleFacturaVenta;
	private Long idProducto;
	private Integer cantidad;
	private BigDecimal precioUnitario;
	private BigDecimal subtotal;
}
