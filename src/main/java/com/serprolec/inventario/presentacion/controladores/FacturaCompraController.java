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

import com.serprolec.inventario.aplicacion.casosuso.entradas.IFacturaCompraUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IProveedorUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IUsuarioUseCase;
import com.serprolec.inventario.presentacion.dto.request.FacturaCompraRequestDto;
import com.serprolec.inventario.presentacion.dto.response.FacturaCompraResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.IFacturaCompraDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/FacturaCompra")
public class FacturaCompraController {

	private final IFacturaCompraUseCase facturaCompraUseCase;
	private final IProveedorUseCase proveedorUseCase;
	private final IUsuarioUseCase usuarioUseCase;
	private final IFacturaCompraDtoMapper mapper;

	public FacturaCompraController(IFacturaCompraUseCase facturaCompraUseCase, IProveedorUseCase proveedorUseCase,
			IUsuarioUseCase usuarioUseCase, IFacturaCompraDtoMapper mapper) {
		super();
		this.facturaCompraUseCase = facturaCompraUseCase;
		this.proveedorUseCase = proveedorUseCase;
		this.usuarioUseCase = usuarioUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FacturaCompraResponseDto guardar(@Valid @RequestBody FacturaCompraRequestDto requestFacturaCompra) {
		var facturaCompra = mapper.toDomain(requestFacturaCompra);
		facturaCompra.setProveedor(proveedorUseCase.buscarPorId(requestFacturaCompra.getIdProveedor()));
		facturaCompra.setUsuario(usuarioUseCase.buscarPorId(requestFacturaCompra.getIdUsuario()));
		return mapper.toResponseDto(facturaCompraUseCase.guardar(facturaCompra));
	}

	@GetMapping
	public List<FacturaCompraResponseDto> listarTodos() {
		return facturaCompraUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idFacturaCompra}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idFacturaCompra) {
		facturaCompraUseCase.eliminar(idFacturaCompra);
		return ResponseEntity.noContent().build();
	}
}
