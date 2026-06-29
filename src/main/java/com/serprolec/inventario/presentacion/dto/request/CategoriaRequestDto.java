package com.serprolec.inventario.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CategoriaRequestDto {

	private Long idCategoria;
	@NotBlank
	private String nombreCategoria;
	@NotBlank
	private String descripcion;
	private String estado;
}
