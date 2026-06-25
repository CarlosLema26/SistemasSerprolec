package com.serprolec.inventario.infraestructura.persistencia.jpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@Table(name = "producto")
public class ProductoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProducto;
	private String codigoProducto;
	private String nombreProducto;
	private String descripcion;
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private CategoriaEntity categoria;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private Integer stockActual;
	private Integer stockMinimo;
	private String estado;
	private LocalDateTime fechaRegistro;
}
