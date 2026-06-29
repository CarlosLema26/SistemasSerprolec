package com.serprolec.inventario.presentacion.dto.response;

public class UsuarioResponseDto {

	private Long idUsuario;
	private String nombres;
	private String apellidos;
	private String nombreUsuario;
	private String correo;
	private String telefono;
	private String nombreRol;
	private String estado;

	public Long getIdUsuario() { return idUsuario; }
	public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }
	public String getNombres() { return nombres; }
	public void setNombres(String nombres) { this.nombres = nombres; }
	public String getApellidos() { return apellidos; }
	public void setApellidos(String apellidos) { this.apellidos = apellidos; }
	public String getNombreUsuario() { return nombreUsuario; }
	public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
	public String getCorreo() { return correo; }
	public void setCorreo(String correo) { this.correo = correo; }
	public String getTelefono() { return telefono; }
	public void setTelefono(String telefono) { this.telefono = telefono; }
	public String getNombreRol() { return nombreRol; }
	public void setNombreRol(String nombreRol) { this.nombreRol = nombreRol; }
	public String getEstado() { return estado; }
	public void setEstado(String estado) { this.estado = estado; }
}
