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

import com.serprolec.inventario.aplicacion.casosuso.entradas.IProveedorUseCase;
import com.serprolec.inventario.presentacion.dto.request.ProveedorRequestDto;
import com.serprolec.inventario.presentacion.dto.response.ProveedorResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.IProveedorDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/Proveedor")
public class ProveedorController {

	private final IProveedorUseCase proveedorUseCase;
	private final IProveedorDtoMapper mapper;

	public ProveedorController(IProveedorUseCase proveedorUseCase, IProveedorDtoMapper mapper) {
		super();
		this.proveedorUseCase = proveedorUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProveedorResponseDto guardar(@Valid @RequestBody ProveedorRequestDto requestProveedor) {
		return mapper.toResponseDto(proveedorUseCase.guardar(mapper.toDomain(requestProveedor)));
	}

	@GetMapping
	public List<ProveedorResponseDto> listarTodos() {
		return proveedorUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idProveedor}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idProveedor) {
		proveedorUseCase.eliminar(idProveedor);
		return ResponseEntity.noContent().build();
	}
}
