package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.FacturaCompra;

public interface IFacturaCompraRepositorio {

	FacturaCompra guardar(FacturaCompra nuevoFacturaCompra);

	Optional<FacturaCompra> buscarPorId(Long idFacturaCompra);

	List<FacturaCompra> listarTodos();

	void eliminar(Long idFacturaCompra);
}
