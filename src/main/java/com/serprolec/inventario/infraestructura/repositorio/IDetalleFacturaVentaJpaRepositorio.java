package com.serprolec.inventario.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.serprolec.inventario.infraestructura.persistencia.jpa.DetalleFacturaVentaEntity;

public interface IDetalleFacturaVentaJpaRepositorio extends JpaRepository<DetalleFacturaVentaEntity, Long> {

}
