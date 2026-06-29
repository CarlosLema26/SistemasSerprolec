package com.serprolec.inventario.presentacion.dto.response;

import java.time.LocalDateTime;

public class MovimientoInventarioResponseDto {

	private Long idMovimientoInventario;
	private String nombreProducto;
	private String nombreUsuario;
	private String tipoMovimiento;
	private Integer cantidad;
	private Integer stockAnterior;
	private Integer stockNuevo;
	private String referencia;
	private String observacion;
	private LocalDateTime fechaMovimiento;

	public Long getIdMovimientoInventario() { return idMovimientoInventario; }
	public void setIdMovimientoInventario(Long idMovimientoInventario) { this.idMovimientoInventario = idMovimientoInventario; }
	public String getNombreProducto() { return nombreProducto; }
	public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }
	public String getNombreUsuario() { return nombreUsuario; }
	public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
	public String getTipoMovimiento() { return tipoMovimiento; }
	public void setTipoMovimiento(String tipoMovimiento) { this.tipoMovimiento = tipoMovimiento; }
	public Integer getCantidad() { return cantidad; }
	public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
	public Integer getStockAnterior() { return stockAnterior; }
	public void setStockAnterior(Integer stockAnterior) { this.stockAnterior = stockAnterior; }
	public Integer getStockNuevo() { return stockNuevo; }
	public void setStockNuevo(Integer stockNuevo) { this.stockNuevo = stockNuevo; }
	public String getReferencia() { return referencia; }
	public void setReferencia(String referencia) { this.referencia = referencia; }
	public String getObservacion() { return observacion; }
	public void setObservacion(String observacion) { this.observacion = observacion; }
	public LocalDateTime getFechaMovimiento() { return fechaMovimiento; }
	public void setFechaMovimiento(LocalDateTime fechaMovimiento) { this.fechaMovimiento = fechaMovimiento; }
}
