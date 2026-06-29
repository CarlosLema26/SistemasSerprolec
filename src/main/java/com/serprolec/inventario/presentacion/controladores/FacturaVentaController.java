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

import com.serprolec.inventario.aplicacion.casosuso.entradas.IClienteUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IFacturaVentaUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IUsuarioUseCase;
import com.serprolec.inventario.presentacion.dto.request.FacturaVentaRequestDto;
import com.serprolec.inventario.presentacion.dto.response.FacturaVentaResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.IFacturaVentaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/FacturaVenta")
public class FacturaVentaController {

	private final IFacturaVentaUseCase facturaVentaUseCase;
	private final IClienteUseCase clienteUseCase;
	private final IUsuarioUseCase usuarioUseCase;
	private final IFacturaVentaDtoMapper mapper;

	public FacturaVentaController(IFacturaVentaUseCase facturaVentaUseCase, IClienteUseCase clienteUseCase,
			IUsuarioUseCase usuarioUseCase, IFacturaVentaDtoMapper mapper) {
		super();
		this.facturaVentaUseCase = facturaVentaUseCase;
		this.clienteUseCase = clienteUseCase;
		this.usuarioUseCase = usuarioUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public FacturaVentaResponseDto guardar(@Valid @RequestBody FacturaVentaRequestDto requestFacturaVenta) {
		var facturaVenta = mapper.toDomain(requestFacturaVenta);
		facturaVenta.setCliente(clienteUseCase.buscarPorId(requestFacturaVenta.getIdCliente()));
		facturaVenta.setUsuario(usuarioUseCase.buscarPorId(requestFacturaVenta.getIdUsuario()));
		return mapper.toResponseDto(facturaVentaUseCase.guardar(facturaVenta));
	}

	@GetMapping
	public List<FacturaVentaResponseDto> listarTodos() {
		return facturaVentaUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idFacturaVenta}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idFacturaVenta) {
		facturaVentaUseCase.eliminar(idFacturaVenta);
		return ResponseEntity.noContent().build();
	}
}
