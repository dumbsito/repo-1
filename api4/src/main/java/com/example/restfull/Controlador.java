package com.example.restfull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@GetMapping("/obtener")
public ArrayList<Usuario>obtenerUsuario(){
	return servicio.obtener2();
}

@GetMapping()
		public Page<Usuario>obtenerUser(@RequestParam(value="pageNumber",defaultValue="0")int numeropag,
				@RequestParam(value="pageSize",defaultValue="10")int medidapag){
			return servicio.obtener(numeropag, medidapag);
}	

@PostMapping()
		public ResponseEntity<Usuario> guardar(@Valid @RequestBody Usuario usuariop) {
	return new ResponseEntity<>(servicio.guardar(usuariop),HttpStatus.CREATED);
}
@GetMapping(path="/{id}")
public Optional<Usuario>obtenerporid(@PathVariable("id")Long id){
	return this.servicio.obtenerid(id);
}

@GetMapping("/{edad}")
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
}@GetMapping("/run")
public Usuario devolver() {
	return servicio.run();
}
@GetMapping("/for")
public List<Usuario> fortu() {
 return servicio.fort();
}

}