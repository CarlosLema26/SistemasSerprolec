package com.serprolec.inventario;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uisrael.campeonato.dominio.repositorio.ICategoriaRepositorio;


@SpringBootTest
class InventarioApplicationTests {

    @Autowired
    ICategoriaRepositorio categoriaRepositorio;

    @Test
    void contextLoads() {

  
    }
}