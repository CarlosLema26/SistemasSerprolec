package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Proveedor;

public interface IProveedorRepositorio {

	Proveedor guardar(Proveedor nuevoProveedor);

	Optional<Proveedor> buscarPorId(Long idProveedor);

	List<Proveedor> listarTodos();

	void eliminar(Long idProveedor);
}
