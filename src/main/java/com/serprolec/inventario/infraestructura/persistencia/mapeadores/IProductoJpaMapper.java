package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Producto;
import com.serprolec.inventario.infraestructura.persistencia.jpa.ProductoEntity;

@Mapper(componentModel = "spring")
public interface IProductoJpaMapper {

	Producto toDomain(ProductoEntity entity);

	ProductoEntity toEntity(Producto productoPojo);
}
