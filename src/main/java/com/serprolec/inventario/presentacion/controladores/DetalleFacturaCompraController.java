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

import com.serprolec.inventario.aplicacion.casosuso.entradas.IDetalleFacturaCompraUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IProductoUseCase;
import com.serprolec.inventario.presentacion.dto.request.DetalleFacturaCompraRequestDto;
import com.serprolec.inventario.presentacion.dto.response.DetalleFacturaCompraResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.IDetalleFacturaCompraDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/DetalleFacturaCompra")
public class DetalleFacturaCompraController {

	private final IDetalleFacturaCompraUseCase detalleFacturaCompraUseCase;
	private final IProductoUseCase productoUseCase;
	private final IDetalleFacturaCompraDtoMapper mapper;

	public DetalleFacturaCompraController(IDetalleFacturaCompraUseCase detalleFacturaCompraUseCase,
			IProductoUseCase productoUseCase, IDetalleFacturaCompraDtoMapper mapper) {
		super();
		this.detalleFacturaCompraUseCase = detalleFacturaCompraUseCase;
		this.productoUseCase = productoUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleFacturaCompraResponseDto guardar(@Valid @RequestBody DetalleFacturaCompraRequestDto requestDetalleFacturaCompra) {
		var detalle = mapper.toDomain(requestDetalleFacturaCompra);
		detalle.setProducto(productoUseCase.buscarPorId(requestDetalleFacturaCompra.getIdProducto()));
		return mapper.toResponseDto(detalleFacturaCompraUseCase.guardar(detalle));
	}

	@GetMapping
	public List<DetalleFacturaCompraResponseDto> listarTodos() {
		return detalleFacturaCompraUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idDetalleFacturaCompra}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idDetalleFacturaCompra) {
		detalleFacturaCompraUseCase.eliminar(idDetalleFacturaCompra);
		return ResponseEntity.noContent().build();
	}
}
