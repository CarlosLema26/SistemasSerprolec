package com.serprolec.inventario.infraestructura.repositorios;

import com.serprolec.inventario.infraestructura.persistencia.jpa.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepositorio extends JpaRepository<ClienteEntity, Long> {
}