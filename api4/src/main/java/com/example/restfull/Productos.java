package com.example.restfull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="productos")
public class Productos {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
long id;
String nombre;
int precio;
Date vencimiento;

public long getId() {
	return id;
}


public String getNombre() {
	return nombre;
}

public int getPrecio() {
	return precio;
}

public Date getVencimiento() {
	return vencimiento;
}



public void setId(long id) {
	this.id = id;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public void setPrecio(int precio) {
	this.precio = precio;
}

public void setVencimiento(Date vencimiento) {
	this.vencimiento = vencimiento;
}
@OneToMany(mappedBy = "productos")

private List<Usuario> students;



}
