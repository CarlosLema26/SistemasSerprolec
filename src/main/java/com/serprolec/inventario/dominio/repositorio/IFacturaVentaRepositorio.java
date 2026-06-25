package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.FacturaVenta;

public interface IFacturaVentaRepositorio {

	FacturaVenta guardar(FacturaVenta nuevoFacturaVenta);

	Optional<FacturaVenta> buscarPorId(Long idFacturaVenta);

	List<FacturaVenta> listarTodos();

	void eliminar(Long idFacturaVenta);
}
