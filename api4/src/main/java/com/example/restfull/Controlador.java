package com.example.restfull;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class Controlador {
@Autowired
Servicio servicio;

@GetMapping()
		public ArrayList<Usuario>obtener(){
			return servicio.obtener();
}	

@PostMapping()
		public Usuario guardar(@RequestBody Usuario usuariop) {
			return this.servicio.guardar(usuariop);
}
@GetMapping(path="/{id}")
public Optional<Usuario>obtenerporid(@PathVariable("id")Long id){
	return this.servicio.obtenerid(id);
}

@GetMapping("/query")
public ArrayList<Usuario>obteneredad(@RequestParam("edad")Integer edad){
	return this.servicio.obtenerEdad(edad);
}
@DeleteMapping(path="/{id}")
public String eliminar(@PathVariable("id")Long id) {
	boolean ok=this.servicio.eliminarusuario(id);
	if(ok) {
		return "Se elimino el id: "+ id;
	}else {
		return "No se pudo eliminar el id";
	}
}

}