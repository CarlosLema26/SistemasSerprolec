package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.Proveedor;

public interface IProveedorUseCase {

	Proveedor guardar(Proveedor nuevoProveedor);

	Proveedor buscarPorId(Long idProveedor);

	List<Proveedor> listarTodos();

	void eliminar(Long idProveedor);
}
