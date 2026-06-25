package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Rol;

public interface IRolRepositorio {

	Rol guardar(Rol nuevoRol);

	Optional<Rol> buscarPorId(Long idRol);

	List<Rol> listarTodos();

	void eliminar(Long idRol);
}
