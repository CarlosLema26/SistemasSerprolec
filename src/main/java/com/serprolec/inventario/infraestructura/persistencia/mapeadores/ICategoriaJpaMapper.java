package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Categoria;
import com.serprolec.inventario.infraestructura.persistencia.jpa.CategoriaEntity;

@Mapper(componentModel = "spring")
public interface ICategoriaJpaMapper {

	Categoria toDomain(CategoriaEntity entity);

	CategoriaEntity toEntity(Categoria categoriaPojo);
}
