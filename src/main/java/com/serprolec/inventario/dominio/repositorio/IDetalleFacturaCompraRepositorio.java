package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaCompra;

public interface IDetalleFacturaCompraRepositorio {

	DetalleFacturaCompra guardar(DetalleFacturaCompra nuevoDetalleFacturaCompra);

	Optional<DetalleFacturaCompra> buscarPorId(Long idDetalleFacturaCompra);

	List<DetalleFacturaCompra> listarTodos();

	void eliminar(Long idDetalleFacturaCompra);
}
