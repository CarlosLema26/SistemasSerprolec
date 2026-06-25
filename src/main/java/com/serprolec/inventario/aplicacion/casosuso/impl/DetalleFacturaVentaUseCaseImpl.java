package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IDetalleFacturaVentaUseCase;
import com.serprolec.inventario.dominio.entidades.DetalleFacturaVenta;
import com.serprolec.inventario.dominio.repositorio.IDetalleFacturaVentaRepositorio;

public class DetalleFacturaVentaUseCaseImpl implements IDetalleFacturaVentaUseCase {

	private final IDetalleFacturaVentaRepositorio repositorio;

	public DetalleFacturaVentaUseCaseImpl(IDetalleFacturaVentaRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public DetalleFacturaVenta guardar(DetalleFacturaVenta nuevoDetalleFacturaVenta) {
		return repositorio.guardar(nuevoDetalleFacturaVenta);
	}

	@Override
	public DetalleFacturaVenta buscarPorId(Long idDetalleFacturaVenta) {
		return repositorio.buscarPorId(idDetalleFacturaVenta)
				.orElseThrow(() -> new RuntimeException("No se encontro DetalleFacturaVenta con id: " + idDetalleFacturaVenta));
	}

	@Override
	public List<DetalleFacturaVenta> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idDetalleFacturaVenta) {
		repositorio.eliminar(idDetalleFacturaVenta);
	}
}
