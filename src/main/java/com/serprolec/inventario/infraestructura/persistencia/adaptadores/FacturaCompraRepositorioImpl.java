package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.FacturaCompra;
import com.serprolec.inventario.dominio.repositorio.IFacturaCompraRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.FacturaCompraEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IFacturaCompraJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IFacturaCompraJpaRepositorio;

public class FacturaCompraRepositorioImpl implements IFacturaCompraRepositorio {

	private final IFacturaCompraJpaRepositorio jpaRepositorio;
	private final IFacturaCompraJpaMapper entityMapper;

	public FacturaCompraRepositorioImpl(IFacturaCompraJpaRepositorio jpaRepositorio, IFacturaCompraJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public FacturaCompra guardar(FacturaCompra nuevoFacturaCompra) {
		FacturaCompraEntity entity = entityMapper.toEntity(nuevoFacturaCompra);
		FacturaCompraEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<FacturaCompra> buscarPorId(Long idFacturaCompra) {
		return jpaRepositorio.findById(idFacturaCompra).map(entityMapper::toDomain);
	}

	@Override
	public List<FacturaCompra> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idFacturaCompra) {
		jpaRepositorio.deleteById(idFacturaCompra);
	}
}


