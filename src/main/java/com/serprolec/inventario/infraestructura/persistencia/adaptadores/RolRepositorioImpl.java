package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Rol;
import com.serprolec.inventario.dominio.repositorio.IRolRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.RolEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IRolJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IRolJpaRepositorio;

public class RolRepositorioImpl implements IRolRepositorio {

	private final IRolJpaRepositorio jpaRepositorio;
	private final IRolJpaMapper entityMapper;

	public RolRepositorioImpl(IRolJpaRepositorio jpaRepositorio, IRolJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Rol guardar(Rol nuevoRol) {
		RolEntity entity = entityMapper.toEntity(nuevoRol);
		RolEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Rol> buscarPorId(Long idRol) {
		return jpaRepositorio.findById(idRol).map(entityMapper::toDomain);
	}

	@Override
	public List<Rol> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idRol) {
		jpaRepositorio.deleteById(idRol);
	}
}


