package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.MovimientoInventario;
import com.serprolec.inventario.infraestructura.persistencia.jpa.MovimientoInventarioEntity;

@Mapper(componentModel = "spring")
public interface IMovimientoInventarioJpaMapper {

	MovimientoInventario toDomain(MovimientoInventarioEntity entity);

	MovimientoInventarioEntity toEntity(MovimientoInventario movimientoInventarioPojo);
}
