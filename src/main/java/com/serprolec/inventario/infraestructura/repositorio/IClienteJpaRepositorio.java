package com.serprolec.inventario.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serprolec.inventario.infraestructura.persistencia.jpa.ClienteEntity;

public interface IClienteJpaRepositorio extends JpaRepository<ClienteEntity, Long> {

}

