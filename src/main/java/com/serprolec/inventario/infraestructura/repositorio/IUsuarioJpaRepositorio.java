package com.serprolec.inventario.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serprolec.inventario.infraestructura.persistencia.jpa.UsuarioEntity;

public interface IUsuarioJpaRepositorio extends JpaRepository<UsuarioEntity, Long> {

}
