package com.serprolec.inventario.dominio.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class FacturaVenta {

	private Long idFacturaVenta;
	private String numeroFactura;
	private LocalDate fechaFactura;
	private Cliente cliente;
	private Usuario usuario;
	private List<DetalleFacturaVenta> detalles;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	private String estado;
	private LocalDateTime fechaRegistro;

	public FacturaVenta(Long idFacturaVenta, String numeroFactura, LocalDate fechaFactura, Cliente cliente,
			Usuario usuario, List<DetalleFacturaVenta> detalles, BigDecimal subtotal, BigDecimal iva,
			BigDecimal total, String estado, LocalDateTime fechaRegistro) {
		this.idFacturaVenta = idFacturaVenta;
		this.numeroFactura = numeroFactura;
		this.fechaFactura = fechaFactura;
		this.cliente = cliente;
		this.usuario = usuario;
		this.detalles = detalles;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
	}

	public FacturaVenta() {
		super();
	}

	public Long getIdFacturaVenta() {
		return idFacturaVenta;
	}

	public void setIdFacturaVenta(Long idFacturaVenta) {
		this.idFacturaVenta = idFacturaVenta;
	}

	public String getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public LocalDate getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(LocalDate fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<DetalleFacturaVenta> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleFacturaVenta> detalles) {
		this.detalles = detalles;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BigDecimal getIva() {
		return iva;
	}

	public void setIva(BigDecimal iva) {
		this.iva = iva;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
}
