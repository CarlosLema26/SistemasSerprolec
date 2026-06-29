package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Proveedor;
import com.serprolec.inventario.presentacion.dto.request.ProveedorRequestDto;
import com.serprolec.inventario.presentacion.dto.response.ProveedorResponseDto;

@Mapper(componentModel = "spring")
public interface IProveedorDtoMapper {

	Proveedor toDomain(ProveedorRequestDto dto);

	ProveedorResponseDto toResponseDto(Proveedor proveedorPojo);
}
