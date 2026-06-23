package com.serprolec.inventario.infraestructura.repositorios;

import com.serprolec.inventario.infraestructura.persistencia.jpa.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepositorio extends JpaRepository<RolEntity, Long> {
}