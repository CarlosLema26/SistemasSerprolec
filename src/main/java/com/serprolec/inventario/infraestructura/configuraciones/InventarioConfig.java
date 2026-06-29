package com.serprolec.inventario.infraestructura.configuraciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.serprolec.inventario.aplicacion.casosuso.entradas.*;
import com.serprolec.inventario.aplicacion.casosuso.impl.*;
import com.serprolec.inventario.dominio.repositorio.*;
import com.serprolec.inventario.infraestructura.persistencia.adaptadores.*;
import com.serprolec.inventario.infraestructura.persistencia.mapeadores.*;
import com.serprolec.inventario.infraestructura.repositorio.*;

@Configuration
public class InventarioConfig {

	@Bean
	ICategoriaRepositorio categoriaRepositorio(ICategoriaJpaRepositorio jpaRepositorio, ICategoriaJpaMapper mapper) {
		return new CategoriaRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	ICategoriaUseCase categoriaUseCase(ICategoriaRepositorio repo) {
		return new CategoriaUseCaseImpl(repo);
	}

	@Bean
	IProveedorRepositorio proveedorRepositorio(IProveedorJpaRepositorio jpaRepositorio, IProveedorJpaMapper mapper) {
		return new ProveedorRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IProveedorUseCase proveedorUseCase(IProveedorRepositorio repo) {
		return new ProveedorUseCaseImpl(repo);
	}

	@Bean
	IClienteRepositorio clienteRepositorio(IClienteJpaRepositorio jpaRepositorio, IClienteJpaMapper mapper) {
		return new ClienteRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IClienteUseCase clienteUseCase(IClienteRepositorio repo) {
		return new ClienteUseCaseImpl(repo);
	}

	@Bean
	IRolRepositorio rolRepositorio(IRolJpaRepositorio jpaRepositorio, IRolJpaMapper mapper) {
		return new RolRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IRolUseCase rolUseCase(IRolRepositorio repo) {
		return new RolUseCaseImpl(repo);
	}

	@Bean
	IUsuarioRepositorio usuarioRepositorio(IUsuarioJpaRepositorio jpaRepositorio, IUsuarioJpaMapper mapper) {
		return new UsuarioRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IUsuarioUseCase usuarioUseCase(IUsuarioRepositorio repo) {
		return new UsuarioUseCaseImpl(repo);
	}

	@Bean
	IProductoRepositorio productoRepositorio(IProductoJpaRepositorio jpaRepositorio, IProductoJpaMapper mapper) {
		return new ProductoRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IProductoUseCase productoUseCase(IProductoRepositorio repo) {
		return new ProductoUseCaseImpl(repo);
	}

	@Bean
	IFacturaCompraRepositorio facturaCompraRepositorio(IFacturaCompraJpaRepositorio jpaRepositorio, IFacturaCompraJpaMapper mapper) {
		return new FacturaCompraRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IFacturaCompraUseCase facturaCompraUseCase(IFacturaCompraRepositorio repo) {
		return new FacturaCompraUseCaseImpl(repo);
	}

	@Bean
	IDetalleFacturaCompraRepositorio detalleFacturaCompraRepositorio(IDetalleFacturaCompraJpaRepositorio jpaRepositorio, IDetalleFacturaCompraJpaMapper mapper) {
		return new DetalleFacturaCompraRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IDetalleFacturaCompraUseCase detalleFacturaCompraUseCase(IDetalleFacturaCompraRepositorio repo) {
		return new DetalleFacturaCompraUseCaseImpl(repo);
	}

	@Bean
	IFacturaVentaRepositorio facturaVentaRepositorio(IFacturaVentaJpaRepositorio jpaRepositorio, IFacturaVentaJpaMapper mapper) {
		return new FacturaVentaRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IFacturaVentaUseCase facturaVentaUseCase(IFacturaVentaRepositorio repo) {
		return new FacturaVentaUseCaseImpl(repo);
	}

	@Bean
	IDetalleFacturaVentaRepositorio detalleFacturaVentaRepositorio(IDetalleFacturaVentaJpaRepositorio jpaRepositorio, IDetalleFacturaVentaJpaMapper mapper) {
		return new DetalleFacturaVentaRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IDetalleFacturaVentaUseCase detalleFacturaVentaUseCase(IDetalleFacturaVentaRepositorio repo) {
		return new DetalleFacturaVentaUseCaseImpl(repo);
	}

	@Bean
	IMovimientoInventarioRepositorio movimientoInventarioRepositorio(IMovimientoInventarioJpaRepositorio jpaRepositorio, IMovimientoInventarioJpaMapper mapper) {
		return new MovimientoInventarioRepositorioImpl(jpaRepositorio, mapper);
	}

	@Bean
	IMovimientoInventarioUseCase movimientoInventarioUseCase(IMovimientoInventarioRepositorio repo) {
		return new MovimientoInventarioUseCaseImpl(repo);
	}
}
