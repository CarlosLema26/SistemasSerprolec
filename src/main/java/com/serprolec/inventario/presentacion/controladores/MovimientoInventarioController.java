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

import com.serprolec.inventario.aplicacion.casosuso.entradas.IMovimientoInventarioUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IProductoUseCase;
import com.serprolec.inventario.aplicacion.casosuso.entradas.IUsuarioUseCase;
import com.serprolec.inventario.presentacion.dto.request.MovimientoInventarioRequestDto;
import com.serprolec.inventario.presentacion.dto.response.MovimientoInventarioResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.IMovimientoInventarioDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/MovimientoInventario")
public class MovimientoInventarioController {

	private final IMovimientoInventarioUseCase movimientoInventarioUseCase;
	private final IProductoUseCase productoUseCase;
	private final IUsuarioUseCase usuarioUseCase;
	private final IMovimientoInventarioDtoMapper mapper;

	public MovimientoInventarioController(IMovimientoInventarioUseCase movimientoInventarioUseCase,
			IProductoUseCase productoUseCase, IUsuarioUseCase usuarioUseCase, IMovimientoInventarioDtoMapper mapper) {
		super();
		this.movimientoInventarioUseCase = movimientoInventarioUseCase;
		this.productoUseCase = productoUseCase;
		this.usuarioUseCase = usuarioUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MovimientoInventarioResponseDto guardar(@Valid @RequestBody MovimientoInventarioRequestDto requestMovimientoInventario) {
		var movimiento = mapper.toDomain(requestMovimientoInventario);
		movimiento.setProducto(productoUseCase.buscarPorId(requestMovimientoInventario.getIdProducto()));
		movimiento.setUsuario(usuarioUseCase.buscarPorId(requestMovimientoInventario.getIdUsuario()));
		return mapper.toResponseDto(movimientoInventarioUseCase.guardar(movimiento));
	}

	@GetMapping
	public List<MovimientoInventarioResponseDto> listarTodos() {
		return movimientoInventarioUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idMovimientoInventario}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idMovimientoInventario) {
		movimientoInventarioUseCase.eliminar(idMovimientoInventario);
		return ResponseEntity.noContent().build();
	}
}
