package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.DetalleFacturaVenta;

public interface IDetalleFacturaVentaRepositorio {

	DetalleFacturaVenta guardar(DetalleFacturaVenta nuevoDetalleFacturaVenta);

	Optional<DetalleFacturaVenta> buscarPorId(Long idDetalleFacturaVenta);

	List<DetalleFacturaVenta> listarTodos();

	void eliminar(Long idDetalleFacturaVenta);
}
