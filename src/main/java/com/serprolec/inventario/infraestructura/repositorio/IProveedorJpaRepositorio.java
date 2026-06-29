package com.serprolec.inventario.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serprolec.inventario.infraestructura.persistencia.jpa.ProveedorEntity;

public interface IProveedorJpaRepositorio extends JpaRepository<ProveedorEntity, Long> {

}

