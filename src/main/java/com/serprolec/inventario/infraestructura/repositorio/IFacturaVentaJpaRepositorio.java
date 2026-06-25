package com.serprolec.inventario.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serprolec.inventario.infraestructura.persistencia.jpa.FacturaVentaEntity;

public interface IFacturaVentaJpaRepositorio extends JpaRepository<FacturaVentaEntity, Long> {

}
