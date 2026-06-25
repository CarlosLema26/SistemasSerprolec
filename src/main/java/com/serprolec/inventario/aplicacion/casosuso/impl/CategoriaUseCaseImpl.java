package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.ICategoriaUseCase;
import com.serprolec.inventario.dominio.entidades.Categoria;
import com.serprolec.inventario.dominio.repositorio.ICategoriaRepositorio;

public class CategoriaUseCaseImpl implements ICategoriaUseCase {

	private final ICategoriaRepositorio repositorio;

	public CategoriaUseCaseImpl(ICategoriaRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Categoria guardar(Categoria nuevoCategoria) {
		return repositorio.guardar(nuevoCategoria);
	}

	@Override
	public Categoria buscarPorId(Long idCategoria) {
		return repositorio.buscarPorId(idCategoria)
				.orElseThrow(() -> new RuntimeException("No se encontro Categoria con id: " + idCategoria));
	}

	@Override
	public List<Categoria> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idCategoria) {
		repositorio.eliminar(idCategoria);
	}
}
