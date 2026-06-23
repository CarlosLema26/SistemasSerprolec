package com.serprolec.inventario.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "productos")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "codigo_producto")
    private String codigoProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaEntity categoria;

    @Column(name = "precio_compra")
    private BigDecimal precioCompra;

    @Column(name = "precio_venta")
    private BigDecimal precioVenta;

    @Column(name = "stock_actual")
    private Integer stockActual;

    @Column(name = "stock_minimo")
    private Integer stockMinimo;

    private Boolean estado;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

}