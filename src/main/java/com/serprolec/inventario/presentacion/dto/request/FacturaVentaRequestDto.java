package com.serprolec.inventario.presentacion.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class FacturaVentaRequestDto {

	private Long idFacturaVenta;
	@NotBlank
	private String numeroFactura;
	private LocalDate fechaFactura;
	private Long idCliente;
	private Long idUsuario;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	private String estado;
}
