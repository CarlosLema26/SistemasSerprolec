package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Categoria;
import com.serprolec.inventario.presentacion.dto.request.CategoriaRequestDto;
import com.serprolec.inventario.presentacion.dto.response.CategoriaResponseDto;

@Mapper(componentModel = "spring")
public interface ICategoriaDtoMapper {

	Categoria toDomain(CategoriaRequestDto dto);

	CategoriaResponseDto toResponseDto(Categoria categoriaPojo);
}
