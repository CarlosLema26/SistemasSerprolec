package com.serprolec.inventario.aplicacion.casosuso.entradas;

import java.util.List;

import com.serprolec.inventario.dominio.entidades.Cliente;

public interface IClienteUseCase {

	Cliente guardar(Cliente nuevoCliente);

	Cliente buscarPorId(Long idCliente);

	List<Cliente> listarTodos();

	void eliminar(Long idCliente);
}
