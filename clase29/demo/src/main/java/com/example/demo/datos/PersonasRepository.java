package com.example.demo.datos;

import com.example.demo.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonasRepository extends JpaRepository<Persona, Integer> {

    public <T> List<T> getAllByOrderByApellido(Class<T> type);

    public int countAllBy();

    @Query("select count(p) from Persona p where p.apellido like :apellido" )
    public int cantidad(@Param("apellido") String apellido);

    //public List<PersonaView> getAllByOrderByApellido();


}
