package com.example.restfull;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends CrudRepository<Usuario,Long> {
public abstract ArrayList<Usuario>findByEdad(Integer edad);


}
