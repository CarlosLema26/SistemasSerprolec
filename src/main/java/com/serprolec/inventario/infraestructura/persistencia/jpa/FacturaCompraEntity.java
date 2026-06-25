package com.serprolec.inventario.infraestructura.persistencia.jpa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "factura_compra")
public class FacturaCompraEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacturaCompra;
	private String numeroFactura;
	private LocalDate fechaFactura;
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private ProveedorEntity proveedor;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private UsuarioEntity usuario;
	private BigDecimal subtotal;
	private BigDecimal iva;
	private BigDecimal total;
	private String estado;
	private LocalDateTime fechaRegistro;
	@OneToMany(mappedBy = "facturaCompra", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<DetalleFacturaCompraEntity> detalles;
}
