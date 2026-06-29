package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IProductoUseCase;
import com.serprolec.inventario.dominio.entidades.Producto;
import com.serprolec.inventario.dominio.repositorio.IProductoRepositorio;

public class ProductoUseCaseImpl implements IProductoUseCase {

	private final IProductoRepositorio repositorio;

	public ProductoUseCaseImpl(IProductoRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public Producto guardar(Producto nuevoProducto) {
		nuevoProducto.setFechaRegistro(LocalDateTime.now());
		return repositorio.guardar(nuevoProducto);
	}

	@Override
	public Producto buscarPorId(Long idProducto) {
		return repositorio.buscarPorId(idProducto)
				.orElseThrow(() -> new RuntimeException("No se encontro Producto con id: " + idProducto));
	}

	@Override
	public List<Producto> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idProducto) {
		repositorio.eliminar(idProducto);
	}
}
