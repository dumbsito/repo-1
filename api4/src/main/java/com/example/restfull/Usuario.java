package com.example.restfull;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true,nullable=false)
private Long id;
private String nombre;
private String email;
private int edad;
public Long getId() {
	return id;
}
public String getNombre() {
	return nombre;
}
public String getEmail() {
	return email;
}

public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public void setId(Long id) {
	this.id = id;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setEmail(String email) {
	this.email = email;
}

}
