package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.FacturaCompra;
import com.serprolec.inventario.infraestructura.persistencia.jpa.FacturaCompraEntity;

@Mapper(componentModel = "spring", uses = { IProveedorJpaMapper.class, IUsuarioJpaMapper.class, IDetalleFacturaCompraJpaMapper.class })
public interface IFacturaCompraJpaMapper {

	FacturaCompra toDomain(FacturaCompraEntity entity);

	FacturaCompraEntity toEntity(FacturaCompra facturaCompraPojo);
}
