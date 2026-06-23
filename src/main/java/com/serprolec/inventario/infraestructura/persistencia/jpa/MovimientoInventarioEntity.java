package com.serprolec.inventario.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movimientos_inventario")
public class MovimientoInventarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento_inventario")
    private Long idMovimientoInventario;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoEntity producto;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "tipo_movimiento")
    private String tipoMovimiento;

    private Integer cantidad;

    @Column(name = "stock_anterior")
    private Integer stockAnterior;

    @Column(name = "stock_nuevo")
    private Integer stockNuevo;

    private String referencia;

    private String observacion;

    @Column(name = "fecha_movimiento")
    private LocalDate fechaMovimiento;

}