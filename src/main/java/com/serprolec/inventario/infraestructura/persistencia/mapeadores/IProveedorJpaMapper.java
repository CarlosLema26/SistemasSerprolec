package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Proveedor;
import com.serprolec.inventario.infraestructura.persistencia.jpa.ProveedorEntity;

@Mapper(componentModel = "spring")
public interface IProveedorJpaMapper {

	Proveedor toDomain(ProveedorEntity entity);

	ProveedorEntity toEntity(Proveedor proveedorPojo);
}
