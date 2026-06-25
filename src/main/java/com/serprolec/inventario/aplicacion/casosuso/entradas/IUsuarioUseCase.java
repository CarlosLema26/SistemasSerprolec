package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.Usuario;

public interface IUsuarioUseCase {

	Usuario guardar(Usuario nuevoUsuario);

	Usuario buscarPorId(Long idUsuario);

	List<Usuario> listarTodos();

	void eliminar(Long idUsuario);
}
