package com.serprolec.inventario.dominio.entidades;

public class Proveedor {

	private Long idProveedor;
	private String nombreProveedor;
	private String ruc;
	private String telefono;
	private String correo;
	private String direccion;
	private String estado;

	public Proveedor(Long idProveedor, String nombreProveedor, String ruc, String telefono, String correo,
			String direccion, String estado) {
		this.idProveedor = idProveedor;
		this.nombreProveedor = nombreProveedor;
		this.ruc = ruc;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.estado = estado;
	}

	public Proveedor() {
		super();
	}

	public Long getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Long idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
