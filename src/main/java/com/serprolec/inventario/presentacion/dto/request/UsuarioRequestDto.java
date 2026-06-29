package com.serprolec.inventario.presentacion.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UsuarioRequestDto {

	private Long idUsuario;
	@NotBlank
	private String nombres;
	@NotBlank
	private String apellidos;
	@NotBlank
	private String nombreUsuario;
	@NotBlank
	private String contrasena;
	@NotBlank
	private String correo;
	@NotBlank
	private String telefono;
	private Long idRol;
	private String estado;
}
