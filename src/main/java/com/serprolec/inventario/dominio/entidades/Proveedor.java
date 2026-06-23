package com.serprolec.inventario.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {
    private Long idProveedor;
    private String nombreProveedor;
    private String ruc;
    private String telefono;
    private String correo;
    private String direccion;
    private String estado;
}