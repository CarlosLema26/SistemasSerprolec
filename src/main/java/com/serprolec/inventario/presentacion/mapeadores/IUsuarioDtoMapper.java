package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.Usuario;
import com.serprolec.inventario.presentacion.dto.request.UsuarioRequestDto;
import com.serprolec.inventario.presentacion.dto.response.UsuarioResponseDto;

@Mapper(componentModel = "spring")
public interface IUsuarioDtoMapper {

	@Mapping(target = "rol", ignore = true)
	@Mapping(target = "fechaCreacion", ignore = true)
	Usuario toDomain(UsuarioRequestDto dto);

	@Mapping(target = "nombreRol", source = "rol.nombreRol")
	UsuarioResponseDto toResponseDto(Usuario usuarioPojo);
}
