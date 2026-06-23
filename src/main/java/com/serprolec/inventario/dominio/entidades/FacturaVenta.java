package com.serprolec.inventario.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaVenta {
    private Long idFacturaVenta;
    private String numeroFactura;
    private LocalDate fechaFactura;
    private Cliente cliente;
    private Usuario usuario;
    private List<DetalleFacturaVenta> detalles;
    private BigDecimal subtotal;
    private BigDecimal iva;
    private BigDecimal total;
    private String estado;
    private LocalDateTime fechaRegistro;
}