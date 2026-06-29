package com.serprolec.inventario.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RolRequestDto {

	private Long idRol;
	@NotBlank
	private String nombreRol;
	@NotBlank
	private String descripcion;
}
