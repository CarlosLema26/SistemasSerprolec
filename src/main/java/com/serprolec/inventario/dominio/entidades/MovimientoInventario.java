package com.serprolec.inventario.dominio.entidades;

import java.time.LocalDateTime;

public class MovimientoInventario {

	private Long idMovimientoInventario;
	private Producto producto;
	private Usuario usuario;
	private String tipoMovimiento;
	private Integer cantidad;
	private Integer stockAnterior;
	private Integer stockNuevo;
	private String referencia;
	private String observacion;
	private LocalDateTime fechaMovimiento;

	public MovimientoInventario(Long idMovimientoInventario, Producto producto, Usuario usuario,
			String tipoMovimiento, Integer cantidad, Integer stockAnterior, Integer stockNuevo,
			String referencia, String observacion, LocalDateTime fechaMovimiento) {
		this.idMovimientoInventario = idMovimientoInventario;
		this.producto = producto;
		this.usuario = usuario;
		this.tipoMovimiento = tipoMovimiento;
		this.cantidad = cantidad;
		this.stockAnterior = stockAnterior;
		this.stockNuevo = stockNuevo;
		this.referencia = referencia;
		this.observacion = observacion;
		this.fechaMovimiento = fechaMovimiento;
	}

	public MovimientoInventario() {
		super();
	}

	public Long getIdMovimientoInventario() {
		return idMovimientoInventario;
	}

	public void setIdMovimientoInventario(Long idMovimientoInventario) {
		this.idMovimientoInventario = idMovimientoInventario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getStockAnterior() {
		return stockAnterior;
	}

	public void setStockAnterior(Integer stockAnterior) {
		this.stockAnterior = stockAnterior;
	}

	public Integer getStockNuevo() {
		return stockNuevo;
	}

	public void setStockNuevo(Integer stockNuevo) {
		this.stockNuevo = stockNuevo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public LocalDateTime getFechaMovimiento() {
		return fechaMovimiento;
	}

	public void setFechaMovimiento(LocalDateTime fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
}
