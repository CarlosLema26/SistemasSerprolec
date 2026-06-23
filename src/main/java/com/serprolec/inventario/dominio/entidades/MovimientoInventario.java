package com.serprolec.inventario.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovimientoInventario {
    private Long idMovimientoInventario;
    private Producto producto;
    private Usuario usuario;
    private String tipoMovimiento;
    private Integer cantidad;
    private Integer stockAnterior;
    private Integer stockNuevo;
    private String referencia;
    private String observacion;
    private LocalDateTime fechaMovimiento;
}