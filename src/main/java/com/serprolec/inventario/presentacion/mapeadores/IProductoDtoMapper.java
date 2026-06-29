package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.Producto;
import com.serprolec.inventario.presentacion.dto.request.ProductoRequestDto;
import com.serprolec.inventario.presentacion.dto.response.ProductoResponseDto;

@Mapper(componentModel = "spring")
public interface IProductoDtoMapper {

	@Mapping(target = "categoria", ignore = true)
	@Mapping(target = "fechaRegistro", ignore = true)
	Producto toDomain(ProductoRequestDto dto);

	@Mapping(target = "nombreCategoria", source = "categoria.nombreCategoria")
	ProductoResponseDto toResponseDto(Producto productoPojo);
}
