package com.serprolec.inventario.dominio.entidades;

import java.math.BigDecimal;

public class DetalleFacturaVenta {

	private Long idDetalleFacturaVenta;
	private Producto producto;
	private Integer cantidad;
	private BigDecimal precioUnitario;
	private BigDecimal subtotal;

	public DetalleFacturaVenta(Long idDetalleFacturaVenta, Producto producto, Integer cantidad,
			BigDecimal precioUnitario, BigDecimal subtotal) {
		this.idDetalleFacturaVenta = idDetalleFacturaVenta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
	}

	public DetalleFacturaVenta() {
		super();
	}

	public Long getIdDetalleFacturaVenta() {
		return idDetalleFacturaVenta;
	}

	public void setIdDetalleFacturaVenta(Long idDetalleFacturaVenta) {
		this.idDetalleFacturaVenta = idDetalleFacturaVenta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
}
