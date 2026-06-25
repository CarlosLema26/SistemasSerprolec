package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IMovimientoInventarioUseCase;
import com.serprolec.inventario.dominio.entidades.MovimientoInventario;
import com.serprolec.inventario.dominio.repositorio.IMovimientoInventarioRepositorio;

public class MovimientoInventarioUseCaseImpl implements IMovimientoInventarioUseCase {

	private final IMovimientoInventarioRepositorio repositorio;

	public MovimientoInventarioUseCaseImpl(IMovimientoInventarioRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public MovimientoInventario guardar(MovimientoInventario nuevoMovimientoInventario) {
		return repositorio.guardar(nuevoMovimientoInventario);
	}

	@Override
	public MovimientoInventario buscarPorId(Long idMovimientoInventario) {
		return repositorio.buscarPorId(idMovimientoInventario)
				.orElseThrow(() -> new RuntimeException("No se encontro MovimientoInventario con id: " + idMovimientoInventario));
	}

	@Override
	public List<MovimientoInventario> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idMovimientoInventario) {
		repositorio.eliminar(idMovimientoInventario);
	}
}
