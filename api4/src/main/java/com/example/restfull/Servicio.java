package com.example.restfull;

import java.util.ArrayList; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Servicio {
	@Autowired
	Repositorio usuario;
	
	public ArrayList<Usuario>obtener(){
		return(ArrayList<Usuario>)usuario.findAll();
	}

	public Usuario guardar(Usuario usuariop) {
		return usuario.save(usuariop);
	}
	
	public Optional<Usuario>obtenerid(Long id){
		return usuario.findById(id);
	}
	
	public ArrayList<Usuario>obtenerEdad(Integer edad){
		return usuario.findByEdad(edad);
	}
	
	public boolean eliminarusuario(Long id) {
		try {
		usuario.deleteById(id);
		return true;
	}catch(Exception e) {
		return false;
	}
}
	
	
}