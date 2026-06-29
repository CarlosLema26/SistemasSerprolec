package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IFacturaVentaUseCase;
import com.serprolec.inventario.dominio.entidades.FacturaVenta;
import com.serprolec.inventario.dominio.repositorio.IFacturaVentaRepositorio;

public class FacturaVentaUseCaseImpl implements IFacturaVentaUseCase {

	private final IFacturaVentaRepositorio repositorio;

	public FacturaVentaUseCaseImpl(IFacturaVentaRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public FacturaVenta guardar(FacturaVenta nuevoFacturaVenta) {
		nuevoFacturaVenta.setFechaRegistro(LocalDateTime.now());
		return repositorio.guardar(nuevoFacturaVenta);
	}

	@Override
	public FacturaVenta buscarPorId(Long idFacturaVenta) {
		return repositorio.buscarPorId(idFacturaVenta)
				.orElseThrow(() -> new RuntimeException("No se encontro FacturaVenta con id: " + idFacturaVenta));
	}

	@Override
	public List<FacturaVenta> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idFacturaVenta) {
		repositorio.eliminar(idFacturaVenta);
	}
}
