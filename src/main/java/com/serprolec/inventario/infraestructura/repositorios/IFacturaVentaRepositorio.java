package com.serprolec.inventario.infraestructura.repositorios;

import com.serprolec.inventario.infraestructura.persistencia.jpa.FacturaVentaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IFacturaVentaRepositorio extends JpaRepository<FacturaVentaEntity, Long> {
    Optional<FacturaVentaEntity> findByNumeroFactura(String numeroFactura);
    List<FacturaVentaEntity> findByFechaFacturaBetween(LocalDate desde, LocalDate hasta);
}