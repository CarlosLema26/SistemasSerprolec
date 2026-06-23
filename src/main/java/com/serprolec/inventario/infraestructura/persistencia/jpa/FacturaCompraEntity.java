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
@Table(name = "facturas_compras")
public class FacturaCompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura_compra")
    private Long idFacturaCompra;

    @Column(name = "numero_factura")
    private String numeroFactura;

    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;

    @ManyToOne
    @JoinColumn(name = "id_proveedor")
    private ProveedorEntity proveedor;

    @Column(name = "id_usuario")
    private Long idUsuario;

    private BigDecimal subtotal;

    private BigDecimal iva;

    private BigDecimal total;

    private Boolean estado;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

}