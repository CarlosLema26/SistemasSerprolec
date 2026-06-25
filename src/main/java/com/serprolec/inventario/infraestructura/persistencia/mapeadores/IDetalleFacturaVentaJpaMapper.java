package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaVenta;
import com.serprolec.inventario.infraestructura.persistencia.jpa.DetalleFacturaVentaEntity;

@Mapper(componentModel = "spring")
public interface IDetalleFacturaVentaJpaMapper {

	DetalleFacturaVenta toDomain(DetalleFacturaVentaEntity entity);

	@Mapping(target = "facturaVenta", ignore = true)
	DetalleFacturaVentaEntity toEntity(DetalleFacturaVenta detalleFacturaVentaPojo);
}
