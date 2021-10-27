package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonasAPI {

    @Autowired PersonasDAO p;
    @Autowired PersonasRepository pr;

    @GetMapping("/todas")
    public List<Persona> obtenerTodas()
    {
        return pr.getAllByOrderByApellido();
        //return p.obtenerPersonas();
    }

    @GetMapping("/{id}")
    public Persona obtenerUna(@PathVariable int id)
    {
        Persona encontrada = p.obtener(id);
        if (encontrada == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La persona no existe");
        return encontrada;
    }

    @PostMapping("/{id}")
    public int agregar(@PathVariable int id, Persona nueva) { return 1; }

    @PutMapping("/{id}")
    public void modificar(@PathVariable int id, Persona modificada) {}

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable int id) {
        p.borrar(id);
    }

}
