package com.serprolec.inventario.infraestructura.repositorios;

import com.serprolec.inventario.infraestructura.persistencia.jpa.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IProductoRepositorio extends JpaRepository<ProductoEntity, Long> {
    List<ProductoEntity> findByNombreProductoContainingIgnoreCase(String nombre);
    List<ProductoEntity> findByCodigoProducto(String codigo);
    List<ProductoEntity> findByCategoriaIdCategoria(Long idCategoria);
    List<ProductoEntity> findByStockActualLessThanEqual(Integer stockMinimo);
}