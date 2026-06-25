package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.MovimientoInventario;

public interface IMovimientoInventarioUseCase {

	MovimientoInventario guardar(MovimientoInventario nuevoMovimientoInventario);

	MovimientoInventario buscarPorId(Long idMovimientoInventario);

	List<MovimientoInventario> listarTodos();

	void eliminar(Long idMovimientoInventario);
}
