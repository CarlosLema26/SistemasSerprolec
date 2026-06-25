package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Usuario;
import com.serprolec.inventario.infraestructura.persistencia.jpa.UsuarioEntity;

@Mapper(componentModel = "spring")
public interface IUsuarioJpaMapper {

	Usuario toDomain(UsuarioEntity entity);

	UsuarioEntity toEntity(Usuario usuarioPojo);
}
