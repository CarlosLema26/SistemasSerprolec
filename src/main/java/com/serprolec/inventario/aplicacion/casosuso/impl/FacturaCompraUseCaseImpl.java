package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IFacturaCompraUseCase;
import com.serprolec.inventario.dominio.entidades.FacturaCompra;
import com.serprolec.inventario.dominio.repositorio.IFacturaCompraRepositorio;

public class FacturaCompraUseCaseImpl implements IFacturaCompraUseCase {

	private final IFacturaCompraRepositorio repositorio;

	public FacturaCompraUseCaseImpl(IFacturaCompraRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public FacturaCompra guardar(FacturaCompra nuevoFacturaCompra) {
		nuevoFacturaCompra.setFechaRegistro(LocalDateTime.now());
		return repositorio.guardar(nuevoFacturaCompra);
	}

	@Override
	public FacturaCompra buscarPorId(Long idFacturaCompra) {
		return repositorio.buscarPorId(idFacturaCompra)
				.orElseThrow(() -> new RuntimeException("No se encontro FacturaCompra con id: " + idFacturaCompra));
	}

	@Override
	public List<FacturaCompra> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idFacturaCompra) {
		repositorio.eliminar(idFacturaCompra);
	}
}
