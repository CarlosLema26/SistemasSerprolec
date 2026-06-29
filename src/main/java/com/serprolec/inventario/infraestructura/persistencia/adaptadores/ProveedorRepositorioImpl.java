package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Proveedor;
import com.serprolec.inventario.dominio.repositorio.IProveedorRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.ProveedorEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IProveedorJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IProveedorJpaRepositorio;

public class ProveedorRepositorioImpl implements IProveedorRepositorio {

	private final IProveedorJpaRepositorio jpaRepositorio;
	private final IProveedorJpaMapper entityMapper;

	public ProveedorRepositorioImpl(IProveedorJpaRepositorio jpaRepositorio, IProveedorJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Proveedor guardar(Proveedor nuevoProveedor) {
		ProveedorEntity entity = entityMapper.toEntity(nuevoProveedor);
		ProveedorEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Proveedor> buscarPorId(Long idProveedor) {
		return jpaRepositorio.findById(idProveedor).map(entityMapper::toDomain);
	}

	@Override
	public List<Proveedor> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idProveedor) {
		jpaRepositorio.deleteById(idProveedor);
	}
}


