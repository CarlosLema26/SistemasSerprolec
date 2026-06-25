package com.serprolec.inventario.infraestructura.persistencia.mapeadores;

import org.mapstruct.Mapper;

import com.serprolec.inventario.dominio.entidades.Cliente;
import com.serprolec.inventario.infraestructura.persistencia.jpa.ClienteEntity;

@Mapper(componentModel = "spring")
public interface IClienteJpaMapper {

	Cliente toDomain(ClienteEntity entity);

	ClienteEntity toEntity(Cliente clientePojo);
}
