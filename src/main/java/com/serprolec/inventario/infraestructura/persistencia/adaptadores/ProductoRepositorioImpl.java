package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Producto;
import com.serprolec.inventario.dominio.repositorio.IProductoRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.ProductoEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IProductoJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IProductoJpaRepositorio;

public class ProductoRepositorioImpl implements IProductoRepositorio {

	private final IProductoJpaRepositorio jpaRepositorio;
	private final IProductoJpaMapper entityMapper;

	public ProductoRepositorioImpl(IProductoJpaRepositorio jpaRepositorio, IProductoJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Producto guardar(Producto nuevoProducto) {
		ProductoEntity entity = entityMapper.toEntity(nuevoProducto);
		ProductoEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Producto> buscarPorId(Long idProducto) {
		return jpaRepositorio.findById(idProducto).map(entityMapper::toDomain);
	}

	@Override
	public List<Producto> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idProducto) {
		jpaRepositorio.deleteById(idProducto);
	}
}


