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
import com.serprolec.inventario.aplicacion.casosuso.entradas.IProductoUseCase;
import com.serprolec.inventario.presentacion.dto.request.ProductoRequestDto;
import com.serprolec.inventario.presentacion.dto.response.ProductoResponseDto;
import com.serprolec.inventario.presentacion.mapeadores.IProductoDtoMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/Serprolec/Producto")
public class ProductoController {

	private final IProductoUseCase productoUseCase;
	private final ICategoriaUseCase categoriaUseCase;
	private final IProductoDtoMapper mapper;

	public ProductoController(IProductoUseCase productoUseCase, ICategoriaUseCase categoriaUseCase, IProductoDtoMapper mapper) {
		super();
		this.productoUseCase = productoUseCase;
		this.categoriaUseCase = categoriaUseCase;
		this.mapper = mapper;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductoResponseDto guardar(@Valid @RequestBody ProductoRequestDto requestProducto) {
		var producto = mapper.toDomain(requestProducto);
		producto.setCategoria(categoriaUseCase.buscarPorId(requestProducto.getIdCategoria()));
		return mapper.toResponseDto(productoUseCase.guardar(producto));
	}

	@GetMapping
	public List<ProductoResponseDto> listarTodos() {
		return productoUseCase.listarTodos().stream().map(mapper::toResponseDto).toList();
	}

	@DeleteMapping("/{idProducto}")
	public ResponseEntity<Void> eliminar(@PathVariable Long idProducto) {
		productoUseCase.eliminar(idProducto);
		return ResponseEntity.noContent().build();
	}
}
