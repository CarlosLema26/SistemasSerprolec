package com.serprolec.inventario.presentacion.controladores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.serprolec.inventario.aplicacion.casosuso.entradas.IDetalleFacturaVentaUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IProductoUseCase;
import com.serprolec.inventario.presentacion.dto.request.DetalleFacturaVentaRequestDto;
import com.serprolec.inventario.presentacion.dto.response.DetalleFacturaVentaResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.IDetalleFacturaVentaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/DetalleFacturaVenta")
public class DetalleFacturaVentaController {

	private final IDetalleFacturaVentaUseCase detalleFacturaVentaUseCase;
	private final IProductoUseCase productoUseCase;
	private final IDetalleFacturaVentaDtoMapper mapper;

	public DetalleFacturaVentaController(IDetalleFacturaVentaUseCase detalleFacturaVentaUseCase,
			IProductoUseCase productoUseCase, IDetalleFacturaVentaDtoMapper mapper) {
		super();
		this.detalleFacturaVentaUseCase = detalleFacturaVentaUseCase;
		this.productoUseCase = productoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleFacturaVentaResponseDto guardar(@Valid @RequestBody DetalleFacturaVentaRequestDto requestDetalleFacturaVenta) {
		var detalle = mapper.toDomain(requestDetalleFacturaVenta);
		detalle.setProducto(productoUseCase.buscarPorId(requestDetalleFacturaVenta.getIdProducto()));
		return mapper.toResponseDto(detalleFacturaVentaUseCase.guardar(detalle));
	}

	@GetMapping
	public List<DetalleFacturaVentaResponseDto> listarTodos() {
		return detalleFacturaVentaUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idDetalleFacturaVenta}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idDetalleFacturaVenta) {
		detalleFacturaVentaUseCase.eliminar(idDetalleFacturaVenta);
		return ResponseEntity.noContent().build();
	}
}
