package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Cliente;
import com.serprolec.inventario.presentacion.dto.request.ClienteRequestDto;
import com.serprolec.inventario.presentacion.dto.response.ClienteResponseDto;

@Mapper(componentModel = "spring")
public interface IClienteDtoMapper {

	Cliente toDomain(ClienteRequestDto dto);

	ClienteResponseDto toResponseDto(Cliente clientePojo);
}
