package com.serprolec.inventario.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    private Long idProducto;
    private String codigoProducto;
    private String nombreProducto;
    private String descripcion;
    private Categoria categoria;
    private BigDecimal precioCompra;
    private BigDecimal precioVenta;
    private Integer stockActual;
    private Integer stockMinimo;
    private String estado;
    private LocalDateTime fechaRegistro;
}