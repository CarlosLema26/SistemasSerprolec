package com.serprolec.inventario.infraestructura.persistencia.jpa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detalles_facturas_compras")
public class DetalleFacturaCompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle_factura_compra")
    private Long idDetalleFacturaCompra;

    @ManyToOne
    @JoinColumn(name = "id_factura_compra")
    private FacturaCompraEntity facturaCompra;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private ProductoEntity producto;

    private Integer cantidad;

    @Column(name = "precio_unitario")
    private BigDecimal precioUnitario;

    private BigDecimal subtotal;

}