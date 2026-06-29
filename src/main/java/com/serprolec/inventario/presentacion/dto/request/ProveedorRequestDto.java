package com.serprolec.inventario.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ProveedorRequestDto {

	private Long idProveedor;
	@NotBlank
	private String nombreProveedor;
	@NotBlank
	private String ruc;
	@NotBlank
	private String telefono;
	@NotBlank
	private String correo;
	@NotBlank
	private String direccion;
	private String estado;
}
