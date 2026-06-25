package com.serprolec.inventario.infraestructura.persistencia.jpa;

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
@Table(name = "movimiento_inventario")
public class MovimientoInventarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMovimientoInventario;
	@ManyToOne
	@JoinColumn(name = "id_producto")
	private ProductoEntity producto;
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private UsuarioEntity usuario;
	private String tipoMovimiento;
	private Integer cantidad;
	private Integer stockAnterior;
	private Integer stockNuevo;
	private String referencia;
	private String observacion;
	private LocalDateTime fechaMovimiento;
}
