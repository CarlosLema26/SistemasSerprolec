package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.Producto;

public interface IProductoUseCase {

	Producto guardar(Producto nuevoProducto);

	Producto buscarPorId(Long idProducto);

	List<Producto> listarTodos();

	void eliminar(Long idProducto);
}
