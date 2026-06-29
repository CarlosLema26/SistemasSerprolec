package com.serprolec.inventario.infraestructura.persistencia.adaptadores;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Cliente;
import com.serprolec.inventario.dominio.repositorio.IClienteRepositorio;
import com.serprolec.inventario.infraestructura.persistencia.jpa.ClienteEntity;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.IClienteJpaMapper;
import com.serprolec.inventario.infraestructura.repositorio.IClienteJpaRepositorio;

public class ClienteRepositorioImpl implements IClienteRepositorio {

	private final IClienteJpaRepositorio jpaRepositorio;
	private final IClienteJpaMapper entityMapper;

	public ClienteRepositorioImpl(IClienteJpaRepositorio jpaRepositorio, IClienteJpaMapper entityMapper) {
		this.jpaRepositorio = jpaRepositorio;
		this.entityMapper = entityMapper;
	}

	@Override
	public Cliente guardar(Cliente nuevoCliente) {
		ClienteEntity entity = entityMapper.toEntity(nuevoCliente);
		ClienteEntity guardado = jpaRepositorio.save(entity);
		return entityMapper.toDomain(guardado);
	}

	@Override
	public Optional<Cliente> buscarPorId(Long idCliente) {
		return jpaRepositorio.findById(idCliente).map(entityMapper::toDomain);
	}

	@Override
	public List<Cliente> listarTodos() {
		return jpaRepositorio.findAll().stream().map(entityMapper::toDomain).toList();
	}

	@Override
	public void eliminar(Long idCliente) {
		jpaRepositorio.deleteById(idCliente);
	}
}


