package com.example.demo;

import org.springframework.stereotype.Repository;

import org.springframework.web.context.annotation.ApplicationScope;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@ApplicationScope
public class PersonasDAO {

    @PersistenceContext EntityManager em;

    //@Transactional
    public List<Persona> obtenerPersonas() {
        return em.createQuery("select p from Persona p", Persona.class).getResultList();
    }

    public Persona obtener(int id) {
        return em.find( Persona.class, id);
    }

    @Transactional
    public void borrar(int id) {
        Persona p = em.find(Persona.class, id);
        if (p != null) {
            em.remove(p);
        }
    }
}
