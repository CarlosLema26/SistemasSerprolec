package com.serprolec.inventario.infraestructura.persistencia.jpa;

import java.math.BigDecimal;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle_factura_venta")
public class DetalleFacturaVentaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetalleFacturaVenta;
	@ManyToOne
	@JoinColumn(name = "id_factura_venta")
	private FacturaVentaEntity facturaVenta;
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private ProductoEntity producto;
	private Integer cantidad;
	private BigDecimal precioUnitario;
	private BigDecimal subtotal;
}
