package com.serprolec.inventario.infraestructura.repositorios;

import com.serprolec.inventario.infraestructura.persistencia.jpa.MovimientoInventarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IMovimientoInventarioRepositorio extends JpaRepository<MovimientoInventarioEntity, Long> {
    List<MovimientoInventarioEntity> findByProductoIdProducto(Long idProducto);
}