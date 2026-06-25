package com.serprolec.inventario.dominio.repositorio;

import java.util.List;
import java.util.Optional;

import com.serprolec.inventario.dominio.entidades.Cliente;

public interface IClienteRepositorio {

	Cliente guardar(Cliente nuevoCliente);

	Optional<Cliente> buscarPorId(Long idCliente);

	List<Cliente> listarTodos();

	void eliminar(Long idCliente);
}
