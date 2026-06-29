package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.MovimientoInventario;
import com.serprolec.inventario.presentacion.dto.request.MovimientoInventarioRequestDto;
import com.serprolec.inventario.presentacion.dto.response.MovimientoInventarioResponseDto;

@Mapper(componentModel = "spring")
public interface IMovimientoInventarioDtoMapper {

	@Mapping(target = "producto", ignore = true)
	@Mapping(target = "usuario", ignore = true)
	MovimientoInventario toDomain(MovimientoInventarioRequestDto dto);

	@Mapping(target = "nombreProducto", source = "producto.nombreProducto")
	@Mapping(target = "nombreUsuario", source = "usuario.nombres")
	MovimientoInventarioResponseDto toResponseDto(MovimientoInventario movimientoInventarioPojo);
}
