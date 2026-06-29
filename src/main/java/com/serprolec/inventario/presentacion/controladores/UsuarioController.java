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

import com.serprolec.inventario.aplicacion.casosuso.entradas.IRolUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IUsuarioUseCase;
import com.serprolec.inventario.presentacion.dto.request.UsuarioRequestDto;
import com.serprolec.inventario.presentacion.dto.response.UsuarioResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.IUsuarioDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/Usuario")
public class UsuarioController {

	private final IUsuarioUseCase usuarioUseCase;
	private final IRolUseCase rolUseCase;
	private final IUsuarioDtoMapper mapper;

	public UsuarioController(IUsuarioUseCase usuarioUseCase, IRolUseCase rolUseCase, IUsuarioDtoMapper mapper) {
		super();
		this.usuarioUseCase = usuarioUseCase;
		this.rolUseCase = rolUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UsuarioResponseDto guardar(@Valid @RequestBody UsuarioRequestDto requestUsuario) {
		var usuario = mapper.toDomain(requestUsuario);
		usuario.setRol(rolUseCase.buscarPorId(requestUsuario.getIdRol()));
		return mapper.toResponseDto(usuarioUseCase.guardar(usuario));
	}

	@GetMapping
	public List<UsuarioResponseDto> listarTodos() {
		return usuarioUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idUsuario}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idUsuario) {
		usuarioUseCase.eliminar(idUsuario);
		return ResponseEntity.noContent().build();
	}
}
