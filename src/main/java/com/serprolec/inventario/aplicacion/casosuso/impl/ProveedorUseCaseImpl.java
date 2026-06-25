package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IProveedorUseCase;
import com.serprolec.inventario.dominio.entidades.Proveedor;
import com.serprolec.inventario.dominio.repositorio.IProveedorRepositorio;

public class ProveedorUseCaseImpl implements IProveedorUseCase {

	private final IProveedorRepositorio repositorio;

	public ProveedorUseCaseImpl(IProveedorRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Proveedor guardar(Proveedor nuevoProveedor) {
		return repositorio.guardar(nuevoProveedor);
	}

	@Override
	public Proveedor buscarPorId(Long idProveedor) {
		return repositorio.buscarPorId(idProveedor)
				.orElseThrow(() -> new RuntimeException("No se encontro Proveedor con id: " + idProveedor));
	}

	@Override
	public List<Proveedor> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idProveedor) {
		repositorio.eliminar(idProveedor);
	}
}
