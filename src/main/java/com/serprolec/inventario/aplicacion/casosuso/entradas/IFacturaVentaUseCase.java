package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.FacturaVenta;

public interface IFacturaVentaUseCase {

	FacturaVenta guardar(FacturaVenta nuevoFacturaVenta);

	FacturaVenta buscarPorId(Long idFacturaVenta);

	List<FacturaVenta> listarTodos();

	void eliminar(Long idFacturaVenta);
}
