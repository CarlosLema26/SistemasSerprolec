package com.serprolec.inventario.dominio.entidades;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class FacturaCompra {

	private Long idFacturaCompra;
	private String numeroFactura;
	private LocalDate fechaFactura;
	private Proveedor proveedor;
	private Usuario usuario;
	private List<DetalleFacturaCompra> detalles;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	private String estado;
	private LocalDateTime fechaRegistro;

	public FacturaCompra(Long idFacturaCompra, String numeroFactura, LocalDate fechaFactura, Proveedor proveedor,
			Usuario usuario, List<DetalleFacturaCompra> detalles, BigDecimal subtotal, BigDecimal iva,
			BigDecimal total, String estado, LocalDateTime fechaRegistro) {
		this.idFacturaCompra = idFacturaCompra;
		this.numeroFactura = numeroFactura;
		this.fechaFactura = fechaFactura;
		this.proveedor = proveedor;
		this.usuario = usuario;
		this.detalles = detalles;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.estado = estado;
		this.fechaRegistro = fechaRegistro;
	}

	public FacturaCompra() {
		super();
	}

	public Long getIdFacturaCompra() {
		return idFacturaCompra;
	}

	public void setIdFacturaCompra(Long idFacturaCompra) {
		this.idFacturaCompra = idFacturaCompra;
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

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<DetalleFacturaCompra> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleFacturaCompra> detalles) {
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
