package com.serprolec.inventario.presentacion.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FacturaCompraRequestDto {

	private Long idFacturaCompra;
	@NotBlank
	private String numeroFactura;
	private LocalDate fechaFactura;
	private Long idProveedor;
	private Long idUsuario;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	private String estado;
}
