package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonasRepository extends JpaRepository<Persona, Integer> {

    public List<Persona> getAllByOrderByApellido();

}
