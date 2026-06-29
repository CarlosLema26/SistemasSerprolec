package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.MovimientoInventario;
import com.serprolec.inventario.dominio.repositorio.IMovimientoInventarioRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.MovimientoInventarioEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IMovimientoInventarioJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IMovimientoInventarioJpaRepositorio;

public class MovimientoInventarioRepositorioImpl implements IMovimientoInventarioRepositorio {

	private final IMovimientoInventarioJpaRepositorio jpaRepositorio;
	private final IMovimientoInventarioJpaMapper entityMapper;

	public MovimientoInventarioRepositorioImpl(IMovimientoInventarioJpaRepositorio jpaRepositorio, IMovimientoInventarioJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public MovimientoInventario guardar(MovimientoInventario nuevoMovimientoInventario) {
		MovimientoInventarioEntity entity = entityMapper.toEntity(nuevoMovimientoInventario);
		MovimientoInventarioEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<MovimientoInventario> buscarPorId(Long idMovimientoInventario) {
		return jpaRepositorio.findById(idMovimientoInventario).map(entityMapper::toDomain);
	}

	@Override
	public List<MovimientoInventario> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idMovimientoInventario) {
		jpaRepositorio.deleteById(idMovimientoInventario);
	}
}


