package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaCompra;
import com.serprolec.inventario.presentacion.dto.request.DetalleFacturaCompraRequestDto;
import com.serprolec.inventario.presentacion.dto.response.DetalleFacturaCompraResponseDto;

@Mapper(componentModel = "spring")
public interface IDetalleFacturaCompraDtoMapper {

	@Mapping(target = "producto", ignore = true)
	DetalleFacturaCompra toDomain(DetalleFacturaCompraRequestDto dto);

	@Mapping(target = "nombreProducto", source = "producto.nombreProducto")
	DetalleFacturaCompraResponseDto toResponseDto(DetalleFacturaCompra detalleFacturaCompraPojo);
}
