package com.serprolec.inventario.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    private Long idCliente;
    private String nombres;
    private String apellidos;
    private String cedulaRuc;
    private String telefono;
    private String correo;
    private String direccion;
    private String estado;
}