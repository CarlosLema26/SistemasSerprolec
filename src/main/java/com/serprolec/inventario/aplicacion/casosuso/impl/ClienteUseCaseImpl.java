package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IClienteUseCase;
import com.serprolec.inventario.dominio.entidades.Cliente;
import com.serprolec.inventario.dominio.repositorio.IClienteRepositorio;

public class ClienteUseCaseImpl implements IClienteUseCase {

	private final IClienteRepositorio repositorio;

	public ClienteUseCaseImpl(IClienteRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Cliente guardar(Cliente nuevoCliente) {
		return repositorio.guardar(nuevoCliente);
	}

	@Override
	public Cliente buscarPorId(Long idCliente) {
		return repositorio.buscarPorId(idCliente)
				.orElseThrow(() -> new RuntimeException("No se encontro Cliente con id: " + idCliente));
	}

	@Override
	public List<Cliente> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idCliente) {
		repositorio.eliminar(idCliente);
	}
}
