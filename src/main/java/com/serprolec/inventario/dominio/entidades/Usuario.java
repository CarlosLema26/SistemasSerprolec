package com.serprolec.inventario.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    private Long idUsuario;
    private String nombres;
    private String apellidos;
    private String nombreUsuario;
    private String contrasena;
    private String correo;
    private String telefono;
    private Rol rol;
    private String estado;
    private LocalDateTime fechaCreacion;
}