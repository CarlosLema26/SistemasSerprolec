package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaVenta;

public interface IDetalleFacturaVentaUseCase {

	DetalleFacturaVenta guardar(DetalleFacturaVenta nuevoDetalleFacturaVenta);

	DetalleFacturaVenta buscarPorId(Long idDetalleFacturaVenta);

	List<DetalleFacturaVenta> listarTodos();

	void eliminar(Long idDetalleFacturaVenta);
}
