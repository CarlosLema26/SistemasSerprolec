package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IUsuarioUseCase;
import com.serprolec.inventario.dominio.entidades.Usuario;
import com.serprolec.inventario.dominio.repositorio.IUsuarioRepositorio;

public class UsuarioUseCaseImpl implements IUsuarioUseCase {

	private final IUsuarioRepositorio repositorio;

	public UsuarioUseCaseImpl(IUsuarioRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Usuario guardar(Usuario nuevoUsuario) {
		return repositorio.guardar(nuevoUsuario);
	}

	@Override
	public Usuario buscarPorId(Long idUsuario) {
		return repositorio.buscarPorId(idUsuario)
				.orElseThrow(() -> new RuntimeException("No se encontro Usuario con id: " + idUsuario));
	}

	@Override
	public List<Usuario> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idUsuario) {
		repositorio.eliminar(idUsuario);
	}
}
