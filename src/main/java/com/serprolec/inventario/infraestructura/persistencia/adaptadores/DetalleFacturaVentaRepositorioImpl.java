package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaVenta;
import com.serprolec.inventario.dominio.repositorio.IDetalleFacturaVentaRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.DetalleFacturaVentaEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IDetalleFacturaVentaJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IDetalleFacturaVentaJpaRepositorio;

public class DetalleFacturaVentaRepositorioImpl implements IDetalleFacturaVentaRepositorio {

	private final IDetalleFacturaVentaJpaRepositorio jpaRepositorio;
	private final IDetalleFacturaVentaJpaMapper entityMapper;

	public DetalleFacturaVentaRepositorioImpl(IDetalleFacturaVentaJpaRepositorio jpaRepositorio, IDetalleFacturaVentaJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public DetalleFacturaVenta guardar(DetalleFacturaVenta nuevoDetalleFacturaVenta) {
		DetalleFacturaVentaEntity entity = entityMapper.toEntity(nuevoDetalleFacturaVenta);
		DetalleFacturaVentaEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<DetalleFacturaVenta> buscarPorId(Long idDetalleFacturaVenta) {
		return jpaRepositorio.findById(idDetalleFacturaVenta).map(entityMapper::toDomain);
	}

	@Override
	public List<DetalleFacturaVenta> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idDetalleFacturaVenta) {
		jpaRepositorio.deleteById(idDetalleFacturaVenta);
	}
}
