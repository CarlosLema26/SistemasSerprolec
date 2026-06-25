package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaCompra;
import com.serprolec.inventario.dominio.repositorio.IDetalleFacturaCompraRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.DetalleFacturaCompraEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IDetalleFacturaCompraJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IDetalleFacturaCompraJpaRepositorio;

public class DetalleFacturaCompraRepositorioImpl implements IDetalleFacturaCompraRepositorio {

	private final IDetalleFacturaCompraJpaRepositorio jpaRepositorio;
	private final IDetalleFacturaCompraJpaMapper entityMapper;

	public DetalleFacturaCompraRepositorioImpl(IDetalleFacturaCompraJpaRepositorio jpaRepositorio, IDetalleFacturaCompraJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public DetalleFacturaCompra guardar(DetalleFacturaCompra nuevoDetalleFacturaCompra) {
		DetalleFacturaCompraEntity entity = entityMapper.toEntity(nuevoDetalleFacturaCompra);
		DetalleFacturaCompraEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<DetalleFacturaCompra> buscarPorId(Long idDetalleFacturaCompra) {
		return jpaRepositorio.findById(idDetalleFacturaCompra).map(entityMapper::toDomain);
	}

	@Override
	public List<DetalleFacturaCompra> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idDetalleFacturaCompra) {
		jpaRepositorio.deleteById(idDetalleFacturaCompra);
	}
}
