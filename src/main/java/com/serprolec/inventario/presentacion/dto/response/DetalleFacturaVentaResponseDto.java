package com.serprolec.inventario.presentacion.dto.response;

import java.math.BigDecimal;

public class DetalleFacturaVentaResponseDto {

	private Long idDetalleFacturaVenta;
	private String nombreProducto;
	private Integer cantidad;
	private BigDecimal precioUnitario;
	private BigDecimal subtotal;

	public Long getIdDetalleFacturaVenta() { return idDetalleFacturaVenta; }
	public void setIdDetalleFacturaVenta(Long idDetalleFacturaVenta) { this.idDetalleFacturaVenta = idDetalleFacturaVenta; }
	public String getNombreProducto() { return nombreProducto; }
	public void setNombreProducto(String nombreProducto) { this.nombreProducto = nombreProducto; }
	public Integer getCantidad() { return cantidad; }
	public void setCantidad(Integer cantidad) { this.cantidad = cantidad; }
	public BigDecimal getPrecioUnitario() { return precioUnitario; }
	public void setPrecioUnitario(BigDecimal precioUnitario) { this.precioUnitario = precioUnitario; }
	public BigDecimal getSubtotal() { return subtotal; }
	public void setSubtotal(BigDecimal subtotal) { this.subtotal = subtotal; }
}
