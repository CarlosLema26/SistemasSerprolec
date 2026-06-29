package com.serprolec.inventario.presentacion.dto.response;

public class ClienteResponseDto {

	private Long idCliente;
	private String nombres;
	private String apellidos;
	private String cedulaRuc;
	private String telefono;
	private String correo;
	private String direccion;
	private String estado;

	public Long getIdCliente() { return idCliente; }
	public void setIdCliente(Long idCliente) { this.idCliente = idCliente; }
	public String getNombres() { return nombres; }
	public void setNombres(String nombres) { this.nombres = nombres; }
	public String getApellidos() { return apellidos; }
	public void setApellidos(String apellidos) { this.apellidos = apellidos; }
	public String getCedulaRuc() { return cedulaRuc; }
	public void setCedulaRuc(String cedulaRuc) { this.cedulaRuc = cedulaRuc; }
	public String getTelefono() { return telefono; }
	public void setTelefono(String telefono) { this.telefono = telefono; }
	public String getCorreo() { return correo; }
	public void setCorreo(String correo) { this.correo = correo; }
	public String getDireccion() { return direccion; }
	public void setDireccion(String direccion) { this.direccion = direccion; }
	public String getEstado() { return estado; }
	public void setEstado(String estado) { this.estado = estado; }
}
