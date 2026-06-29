package com.serprolec.inventario.presentacion.dto.request;

import java.time.LocalDateTime;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MovimientoInventarioRequestDto {

	private Long idMovimientoInventario;
	private Long idProducto;
	private Long idUsuario;
	@NotBlank
	private String tipoMovimiento;
	private Integer cantidad;
	private Integer stockAnterior;
	private Integer stockNuevo;
	private String referencia;
	private String observacion;
	private LocalDateTime fechaMovimiento;
}
