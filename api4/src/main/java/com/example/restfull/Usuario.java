package com.example.restfull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
private Long id;
private String nombre;
@NotNull(message="Este campo es obligatorio")
private String email;
private int edad;
public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}
public Long getId() {
	return id;
}
public String getNombre() {
	return nombre;
}
public String getEmail() {
	return email;
}

public void setId(Long id) {
	this.id = id;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setEmail(String email) {
	this.email = email;
}@ManyToOne
@JoinColumn(name="usuario_producto1")
Productos productos;
public Productos getProductos() {
	return productos;
}
public void setProductos(Productos productos) {
	this.productos = productos;
}

}
