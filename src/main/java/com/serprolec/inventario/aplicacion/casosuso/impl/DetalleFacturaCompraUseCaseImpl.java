package com.serprolec.inventario.aplicacion.casosuso.impl;

import java.util.List;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IDetalleFacturaCompraUseCase;
import com.serprolec.inventario.dominio.entidades.DetalleFacturaCompra;
import com.serprolec.inventario.dominio.repositorio.IDetalleFacturaCompraRepositorio;

public class DetalleFacturaCompraUseCaseImpl implements IDetalleFacturaCompraUseCase {

	private final IDetalleFacturaCompraRepositorio repositorio;

	public DetalleFacturaCompraUseCaseImpl(IDetalleFacturaCompraRepositorio repositorio) {
		this.repositorio = repositorio;
	}

	@Override
	public DetalleFacturaCompra guardar(DetalleFacturaCompra nuevoDetalleFacturaCompra) {
		return repositorio.guardar(nuevoDetalleFacturaCompra);
	}

	@Override
	public DetalleFacturaCompra buscarPorId(Long idDetalleFacturaCompra) {
		return repositorio.buscarPorId(idDetalleFacturaCompra)
				.orElseThrow(() -> new RuntimeException("No se encontro DetalleFacturaCompra con id: " + idDetalleFacturaCompra));
	}

	@Override
	public List<DetalleFacturaCompra> listarTodos() {
		return repositorio.listarTodos();
	}

	@Override
	public void eliminar(Long idDetalleFacturaCompra) {
		repositorio.eliminar(idDetalleFacturaCompra);
	}
}
