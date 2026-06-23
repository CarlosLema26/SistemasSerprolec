package com.serprolec.inventario;

import com.serprolec.inventario.infraestructura.persistencia.jpa.CategoriaEntity;
import com.serprolec.inventario.infraestructura.repositorios.ICategoriaRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InventarioApplicationTests {

    @Autowired
    ICategoriaRepositorio categoriaRepositorio;

    @Test
    void contextLoads() {

      
        CategoriaEntity categoria = new CategoriaEntity();
        categoria.setNombreCategoria("Electronicos");
        categoria.setDescripcion("Productos electronicos");
        categoria.setEstado("activo");
        categoriaRepositorio.save(categoria);
        System.out.println("Categoria guardada: " + categoria.getNombreCategoria());
    
        CategoriaEntity categoria2 = new CategoriaEntity();
        categoria2.setNombreCategoria("Herramientas");
        categoria2.setDescripcion("Herramientas de trabajo");
        categoria2.setEstado("activo");
        categoriaRepositorio.save(categoria2);
        System.out.println("Categoria guardada: " + categoria2.getNombreCategoria());
    }
}