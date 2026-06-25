package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IRolUseCase;
import com.serprolec.inventario.dominio.entidades.Rol;
import com.serprolec.inventario.dominio.repositorio.IRolRepositorio;

public class RolUseCaseImpl implements IRolUseCase {

	private final IRolRepositorio repositorio;

	public RolUseCaseImpl(IRolRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Rol guardar(Rol nuevoRol) {
		return repositorio.guardar(nuevoRol);
	}

	@Override
	public Rol buscarPorId(Long idRol) {
		return repositorio.buscarPorId(idRol)
				.orElseThrow(() -> new RuntimeException("No se encontro Rol con id: " + idRol));
	}

	@Override
	public List<Rol> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idRol) {
		repositorio.eliminar(idRol);
	}
}
