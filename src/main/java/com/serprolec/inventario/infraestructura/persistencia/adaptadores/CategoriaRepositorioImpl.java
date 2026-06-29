package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Categoria;
import com.serprolec.inventario.dominio.repositorio.ICategoriaRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.CategoriaEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.ICategoriaJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.ICategoriaJpaRepositorio;

public class CategoriaRepositorioImpl implements ICategoriaRepositorio {

	private final ICategoriaJpaRepositorio jpaRepositorio;
	private final ICategoriaJpaMapper entityMapper;

	public CategoriaRepositorioImpl(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Categoria guardar(Categoria nuevoCategoria) {
		CategoriaEntity entity = entityMapper.toEntity(nuevoCategoria);
		CategoriaEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Categoria> buscarPorId(Long idCategoria) {
		return jpaRepositorio.findById(idCategoria).map(entityMapper::toDomain);
	}

	@Override
	public List<Categoria> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idCategoria) {
		jpaRepositorio.deleteById(idCategoria);
	}
}


