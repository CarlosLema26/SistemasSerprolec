package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.Rol;

public interface IRolUseCase {

	Rol guardar(Rol nuevoRol);

	Rol buscarPorId(Long idRol);

	List<Rol> listarTodos();

	void eliminar(Long idRol);
}
