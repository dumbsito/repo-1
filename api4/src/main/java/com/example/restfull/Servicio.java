package com.example.restfull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;



@Service
public class Servicio {
	@Autowired
	Repositorio repo;
	
	public Page<Usuario>obtener(int numeropag,int medidapag){
		Pageable pag=PageRequest.of(numeropag,medidapag);
		return (Page<Usuario>) repo.findAll(pag);	
	}
	
	public ArrayList<Usuario>obtener2(){
		return(ArrayList<Usuario>)repo.findAll();
	}

	public Usuario guardar(Usuario usuariop) {
		if(usuariop.getEmail()==null) {
			throw new BadEx();
			}
		return repo.save(usuariop);
	}
	
	public Optional<Usuario>obtenerid(Long id){
		return repo.findById(id);
	}
	
	public ArrayList<Usuario>obtenerEdad(Integer edad){
		return repo.findByEdad(edad);
	}
	
	public boolean eliminarusuario(Long id) {
		try {
		repo.deleteById(id);
		return true;
	}catch(Exception e) {
		return false;
	}
}public Usuario run() {
	Usuario u1=new Usuario();
	u1.setNombre("leandro");
	u1.setEdad(21);
	Productos p1=new Productos();
	p1.setNombre("Pure de tomate");
	p1.setVencimiento(new Date());
	u1.setProductos(p1);
	return repo.save(u1);
}public List<Usuario> fort() {
	
 List<Usuario>dou= (List<Usuario>) repo.findAll();
 dou.stream().filter(p->p.getEdad()>20);
 return dou;

}


}