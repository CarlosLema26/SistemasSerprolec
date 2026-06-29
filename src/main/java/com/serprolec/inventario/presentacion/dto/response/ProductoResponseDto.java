package com.serprolec.inventario.presentacion.dto.response;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductoResponseDto {

	private Long idProducto;
	private String codigoProducto;
	private String nombreProducto;
	private String descripcion;
	private String nombreCategoria;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private Integer stockActual;
	private Integer stockMinimo;
	private String estado;
	private LocalDateTime fechaRegistro;

	public Long getIdProducto() { return idProducto; }
	public void setIdProducto(Long idProducto) { this.idProducto = idProducto; }
	public String getCodigoProducto() { return codigoProducto; }
	public void setCodigoProducto(String codigoProducto) { this.codigoProducto = codigoProducto; }
	public String getNombreProducto() { return nombreProducto; }
	public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }
	public String getDescripcion() { return descripcion; }
	public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	public String getNombreCategoria() { return nombreCategoria; }
	public void setNombreCategoria(String nombreCategoria) { this.nombreCategoria = nombreCategoria; }
	public BigDecimal getPrecioCompra() { return precioCompra; }
	public void setPrecioCompra(BigDecimal precioCompra) { this.precioCompra = precioCompra; }
	public BigDecimal getPrecioVenta() { return precioVenta; }
	public void setPrecioVenta(BigDecimal precioVenta) { this.precioVenta = precioVenta; }
	public Integer getStockActual() { return stockActual; }
	public void setStockActual(Integer stockActual) { this.stockActual = stockActual; }
	public Integer getStockMinimo() { return stockMinimo; }
	public void setStockMinimo(Integer stockMinimo) { this.stockMinimo = stockMinimo; }
	public String getEstado() { return estado; }
	public void setEstado(String estado) { this.estado = estado; }
	public LocalDateTime getFechaRegistro() { return fechaRegistro; }
	public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
