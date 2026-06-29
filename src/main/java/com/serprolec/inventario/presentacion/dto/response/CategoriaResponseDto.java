package com.serprolec.inventario.presentacion.dto.response;

public class CategoriaResponseDto {

	private Long idCategoria;
	private String nombreCategoria;
	private String descripcion;
	private String estado;

	public Long getIdCategoria() { return idCategoria; }
	public void setIdCategoria(Long idCategoria) { this.idCategoria = idCategoria; }
	public String getNombreCategoria() { return nombreCategoria; }
	public void setNombreCategoria(String nombreCategoria) { this.nombreCategoria = nombreCategoria; }
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	public String getEstado() { return estado; }
	public void setEstado(String estado) { this.estado = estado; }
}
