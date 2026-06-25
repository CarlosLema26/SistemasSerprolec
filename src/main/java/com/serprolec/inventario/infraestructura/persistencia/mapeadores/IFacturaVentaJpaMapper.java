package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.FacturaVenta;
import com.serprolec.inventario.infraestructura.persistencia.jpa.FacturaVentaEntity;

@Mapper(componentModel = "spring", uses = { IClienteJpaMapper.class, IUsuarioJpaMapper.class, IDetalleFacturaVentaJpaMapper.class })
public interface IFacturaVentaJpaMapper {

	FacturaVenta toDomain(FacturaVentaEntity entity);

	FacturaVentaEntity toEntity(FacturaVenta facturaVentaPojo);
}
