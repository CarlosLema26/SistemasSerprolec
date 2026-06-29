package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.FacturaVenta;
import com.serprolec.inventario.presentacion.dto.request.FacturaVentaRequestDto;
import com.serprolec.inventario.presentacion.dto.response.FacturaVentaResponseDto;

@Mapper(componentModel = "spring")
public interface IFacturaVentaDtoMapper {

	@Mapping(target = "cliente", ignore = true)
	@Mapping(target = "usuario", ignore = true)
	@Mapping(target = "detalles", ignore = true)
	@Mapping(target = "fechaRegistro", ignore = true)
	FacturaVenta toDomain(FacturaVentaRequestDto dto);

	@Mapping(target = "nombreCliente", source = "cliente.nombres")
	@Mapping(target = "nombreUsuario", source = "usuario.nombres")
	FacturaVentaResponseDto toResponseDto(FacturaVenta facturaVentaPojo);
}
