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

import com.serprolec.inventario.aplicacion.casosuso.entradas.ICategoriaUseCase;
import com.serprolec.inventario.presentacion.dto.request.CategoriaRequestDto;
import com.serprolec.inventario.presentacion.dto.response.CategoriaResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.ICategoriaDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/Categoria")
public class CategoriaController {

	private final ICategoriaUseCase categoriaUseCase;
	private final ICategoriaDtoMapper mapper;

	public CategoriaController(ICategoriaUseCase categoriaUseCase, ICategoriaDtoMapper mapper) {
		super();
		this.categoriaUseCase = categoriaUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CategoriaResponseDto guardar(@Valid @RequestBody CategoriaRequestDto requestCategoria) {
		return mapper.toResponseDto(categoriaUseCase.guardar(mapper.toDomain(requestCategoria)));
	}

	@GetMapping
	public List<CategoriaResponseDto> listarTodos() {
		return categoriaUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idCategoria}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idCategoria) {
		categoriaUseCase.eliminar(idCategoria);
		return ResponseEntity.noContent().build();
	}
}
