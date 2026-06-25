package com.serprolec.inventario.dominio.entidades;

import java.math.BigDecimal;

public class DetalleFacturaCompra {

	private Long idDetalleFacturaCompra;
	private Producto producto;
	private Integer cantidad;
	private BigDecimal precioUnitario;
	private BigDecimal subtotal;

	public DetalleFacturaCompra(Long idDetalleFacturaCompra, Producto producto, Integer cantidad,
			BigDecimal precioUnitario, BigDecimal subtotal) {
		this.idDetalleFacturaCompra = idDetalleFacturaCompra;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
	}

	public DetalleFacturaCompra() {
		super();
	}

	public Long getIdDetalleFacturaCompra() {
		return idDetalleFacturaCompra;
	}

	public void setIdDetalleFacturaCompra(Long idDetalleFacturaCompra) {
		this.idDetalleFacturaCompra = idDetalleFacturaCompra;
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
