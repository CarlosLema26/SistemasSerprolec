package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Usuario;

public interface IUsuarioRepositorio {

	Usuario guardar(Usuario nuevoUsuario);

	Optional<Usuario> buscarPorId(Long idUsuario);

	List<Usuario> listarTodos();

	void eliminar(Long idUsuario);
}
