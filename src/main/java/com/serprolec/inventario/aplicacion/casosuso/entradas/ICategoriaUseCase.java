package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.Categoria;

public interface ICategoriaUseCase {

	Categoria guardar(Categoria nuevoCategoria);

	Categoria buscarPorId(Long idCategoria);

	List<Categoria> listarTodos();

	void eliminar(Long idCategoria);
}
