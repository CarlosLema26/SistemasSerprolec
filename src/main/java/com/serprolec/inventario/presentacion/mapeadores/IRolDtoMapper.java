package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Rol;
import com.serprolec.inventario.presentacion.dto.request.RolRequestDto;
import com.serprolec.inventario.presentacion.dto.response.RolResponseDto;

@Mapper(componentModel = "spring")
public interface IRolDtoMapper {

	Rol toDomain(RolRequestDto dto);

	RolResponseDto toResponseDto(Rol rolPojo);
}
