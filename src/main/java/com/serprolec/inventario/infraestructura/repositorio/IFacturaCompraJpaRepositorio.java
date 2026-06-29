package com.serprolec.inventario.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serprolec.inventario.infraestructura.persistencia.jpa.FacturaCompraEntity;

public interface IFacturaCompraJpaRepositorio extends JpaRepository<FacturaCompraEntity, Long> {

}

