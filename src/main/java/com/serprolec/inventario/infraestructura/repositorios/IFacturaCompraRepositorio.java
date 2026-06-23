package com.serprolec.inventario.infraestructura.repositorios;

import com.serprolec.inventario.infraestructura.persistencia.jpa.FacturaCompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IFacturaCompraRepositorio extends JpaRepository<FacturaCompraEntity, Long> {
    Optional<FacturaCompraEntity> findByNumeroFactura(String numeroFactura);
    List<FacturaCompraEntity> findByFechaFacturaBetween(LocalDate desde, LocalDate hasta);
}