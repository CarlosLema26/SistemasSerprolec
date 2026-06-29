package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaVenta;
import com.serprolec.inventario.presentacion.dto.request.DetalleFacturaVentaRequestDto;
import com.serprolec.inventario.presentacion.dto.response.DetalleFacturaVentaResponseDto;

@Mapper(componentModel = "spring")
public interface IDetalleFacturaVentaDtoMapper {

	@Mapping(target = "producto", ignore = true)
	DetalleFacturaVenta toDomain(DetalleFacturaVentaRequestDto dto);

	@Mapping(target = "nombreProducto", source = "producto.nombreProducto")
	DetalleFacturaVentaResponseDto toResponseDto(DetalleFacturaVenta detalleFacturaVentaPojo);
}
