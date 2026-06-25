package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaCompra;
import com.serprolec.inventario.infraestructura.persistencia.jpa.DetalleFacturaCompraEntity;

@Mapper(componentModel = "spring")
public interface IDetalleFacturaCompraJpaMapper {

	DetalleFacturaCompra toDomain(DetalleFacturaCompraEntity entity);

	@Mapping(target = "facturaCompra", ignore = true)
	DetalleFacturaCompraEntity toEntity(DetalleFacturaCompra detalleFacturaCompraPojo);
}
