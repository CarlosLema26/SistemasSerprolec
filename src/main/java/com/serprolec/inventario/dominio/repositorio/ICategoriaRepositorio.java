package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Categoria;

public interface ICategoriaRepositorio {

	Categoria guardar(Categoria nuevoCategoria);

	Optional<Categoria> buscarPorId(Long idCategoria);

	List<Categoria> listarTodos();

	void eliminar(Long idCategoria);
}
