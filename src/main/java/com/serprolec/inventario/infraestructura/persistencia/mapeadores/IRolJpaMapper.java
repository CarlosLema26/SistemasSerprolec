package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Rol;
import com.serprolec.inventario.infraestructura.persistencia.jpa.RolEntity;

@Mapper(componentModel = "spring")
public interface IRolJpaMapper {

	Rol toDomain(RolEntity entity);

	RolEntity toEntity(Rol rolPojo);
}
