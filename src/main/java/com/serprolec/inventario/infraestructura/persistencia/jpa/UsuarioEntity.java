package com.serprolec.inventario.infraestructura.persistencia.jpa;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	private String nombres;
	private String apellidos;
	private String nombreUsuario;
	private String contrasena;
	private String correo;
	private String telefono;
	@ManyToOne
	@JoinColumn(name = "id_rol")
	private RolEntity rol;
	private String estado;
	private LocalDateTime fechaCreacion;
}
