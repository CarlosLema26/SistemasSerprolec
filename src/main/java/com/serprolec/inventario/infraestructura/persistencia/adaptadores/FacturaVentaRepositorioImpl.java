package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.FacturaVenta;
import com.serprolec.inventario.dominio.repositorio.IFacturaVentaRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.FacturaVentaEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IFacturaVentaJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IFacturaVentaJpaRepositorio;

public class FacturaVentaRepositorioImpl implements IFacturaVentaRepositorio {

	private final IFacturaVentaJpaRepositorio jpaRepositorio;
	private final IFacturaVentaJpaMapper entityMapper;

	public FacturaVentaRepositorioImpl(IFacturaVentaJpaRepositorio jpaRepositorio, IFacturaVentaJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public FacturaVenta guardar(FacturaVenta nuevoFacturaVenta) {
		FacturaVentaEntity entity = entityMapper.toEntity(nuevoFacturaVenta);
		FacturaVentaEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<FacturaVenta> buscarPorId(Long idFacturaVenta) {
		return jpaRepositorio.findById(idFacturaVenta).map(entityMapper::toDomain);
	}

	@Override
	public List<FacturaVenta> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idFacturaVenta) {
		jpaRepositorio.deleteById(idFacturaVenta);
	}
}


