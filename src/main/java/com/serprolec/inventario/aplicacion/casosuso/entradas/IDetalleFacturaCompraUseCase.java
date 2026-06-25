package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaCompra;

public interface IDetalleFacturaCompraUseCase {

	DetalleFacturaCompra guardar(DetalleFacturaCompra nuevoDetalleFacturaCompra);

	DetalleFacturaCompra buscarPorId(Long idDetalleFacturaCompra);

	List<DetalleFacturaCompra> listarTodos();

	void eliminar(Long idDetalleFacturaCompra);
}
