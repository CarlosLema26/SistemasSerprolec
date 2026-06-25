package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Producto;

public interface IProductoRepositorio {

	Producto guardar(Producto nuevoProducto);

	Optional<Producto> buscarPorId(Long idProducto);

	List<Producto> listarTodos();

	void eliminar(Long idProducto);
}
