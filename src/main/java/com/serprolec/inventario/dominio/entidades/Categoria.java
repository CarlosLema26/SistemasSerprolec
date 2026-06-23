package com.serprolec.inventario.dominio.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {
    private Long idCategoria;
    private String nombreCategoria;
    private String descripcion;
    private String estado;
}