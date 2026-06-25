package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.MovimientoInventario;

public interface IMovimientoInventarioRepositorio {

	MovimientoInventario guardar(MovimientoInventario nuevoMovimientoInventario);

	Optional<MovimientoInventario> buscarPorId(Long idMovimientoInventario);

	List<MovimientoInventario> listarTodos();

	void eliminar(Long idMovimientoInventario);
}
