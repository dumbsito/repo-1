package com.example.restfull;

import java.util.ArrayList;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Usuario,Long> {
public abstract ArrayList<Usuario>findByEdad(Integer edad);
public abstract Page<Usuario>findAll(Pageable pag);

}
