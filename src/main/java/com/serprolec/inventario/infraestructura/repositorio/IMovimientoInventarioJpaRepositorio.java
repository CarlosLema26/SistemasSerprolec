package com.serprolec.inventario.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serprolec.inventario.infraestructura.persistencia.jpa.MovimientoInventarioEntity;

public interface IMovimientoInventarioJpaRepositorio extends JpaRepository<MovimientoInventarioEntity, Long> {

}
