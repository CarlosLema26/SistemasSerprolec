package com.serprolec.inventario.presentacion.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.FacturaCompra;
import com.serprolec.inventario.presentacion.dto.request.FacturaCompraRequestDto;
import com.serprolec.inventario.presentacion.dto.response.FacturaCompraResponseDto;

@Mapper(componentModel = "spring")
public interface IFacturaCompraDtoMapper {

	@Mapping(target = "proveedor", ignore = true)
	@Mapping(target = "usuario", ignore = true)
	@Mapping(target = "detalles", ignore = true)
	@Mapping(target = "fechaRegistro", ignore = true)
	FacturaCompra toDomain(FacturaCompraRequestDto dto);

	@Mapping(target = "nombreProveedor", source = "proveedor.nombreProveedor")
	@Mapping(target = "nombreUsuario", source = "usuario.nombres")
	FacturaCompraResponseDto toResponseDto(FacturaCompra facturaCompraPojo);
}
