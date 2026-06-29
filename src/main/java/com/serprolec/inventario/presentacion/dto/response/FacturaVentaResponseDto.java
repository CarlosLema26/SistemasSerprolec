package com.serprolec.inventario.presentacion.dto.response;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FacturaVentaResponseDto {

	private Long idFacturaVenta;
	private String numeroFactura;
	private LocalDate fechaFactura;
	private String nombreCliente;
	private String nombreUsuario;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	private String estado;
	private LocalDateTime fechaRegistro;

	public Long getIdFacturaVenta() { return idFacturaVenta; }
	public void setIdFacturaVenta(Long idFacturaVenta) { this.idFacturaVenta = idFacturaVenta; }
	public String getNumeroFactura() { return numeroFactura; }
	public void setNumeroFactura(String numeroFactura) { this.numeroFactura = numeroFactura; }
	public LocalDate getFechaFactura() { return fechaFactura; }
	public void setFechaFactura(LocalDate fechaFactura) { this.fechaFactura = fechaFactura; }
	public String getNombreCliente() { return nombreCliente; }
	public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }
	public String getNombreUsuario() { return nombreUsuario; }
	public void setNombreUsuario(String nombreUsuario) { this.nombreUsuario = nombreUsuario; }
	public BigDecimal getSubtotal() { return subtotal; }
	public void setSubtotal(BigDecimal subtotal) { this.subtotal = subtotal; }
	public BigDecimal getIva() { return iva; }
	public void setIva(BigDecimal iva) { this.iva = iva; }
	public BigDecimal getTotal() { return total; }
	public void setTotal(BigDecimal total) { this.total = total; }
	public String getEstado() { return estado; }
	public void setEstado(String estado) { this.estado = estado; }
	public LocalDateTime getFechaRegistro() { return fechaRegistro; }
	public void setFechaRegistro(LocalDateTime fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}
