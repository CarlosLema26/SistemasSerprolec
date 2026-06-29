package com.serprolec.inventario.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClienteRequestDto {

	private Long idCliente;
	@NotBlank
	private String nombres;
	@NotBlank
	private String apellidos;
	@NotBlank
	private String cedulaRuc;
	@NotBlank
	private String telefono;
	@NotBlank
	private String correo;
	@NotBlank
	private String direccion;
	private String estado;
}
