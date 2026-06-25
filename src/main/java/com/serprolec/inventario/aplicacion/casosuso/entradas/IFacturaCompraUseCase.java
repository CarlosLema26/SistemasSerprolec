package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.FacturaCompra;

public interface IFacturaCompraUseCase {

	FacturaCompra guardar(FacturaCompra nuevoFacturaCompra);

	FacturaCompra buscarPorId(Long idFacturaCompra);

	List<FacturaCompra> listarTodos();

	void eliminar(Long idFacturaCompra);
}
