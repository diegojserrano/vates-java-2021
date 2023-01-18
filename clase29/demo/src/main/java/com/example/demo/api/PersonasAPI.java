package com.example.demo.api;

import com.example.demo.entidades.Persona;
import com.example.demo.entidades.PersonaView;
import com.example.demo.datos.PersonasDAO;
import com.example.demo.datos.PersonasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonasAPI {

    @Autowired
    PersonasDAO p;

    @Autowired
    PersonasRepository pr;

    @GetMapping("/todas")
    public List obtenerTodas()
    {
        return pr.getAllByOrderByApellido(PersonaView.class);

        //return p.obtenerPersonas();
    }

    @GetMapping("/cantidad")
    public int cantidad() {
        return pr.cantidad("P%");
    }

    @GetMapping("/{id}")
    public Persona obtenerUna(@PathVariable int id)
    {
        Persona encontrada = p.obtener(id);
        if (encontrada == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "La persona no existe");
        return encontrada;
    }

    @PostMapping("/")
    public void agregar(@PathVariable int id, Persona nueva) {
        if (nueva.getApellido().isBlank())
            throw new ResponseStatusException(HttpStatus.NOT_ACCEPTABLE, "La persona no existe");
        pr.saveAndFlush(nueva);
        throw new ResponseStatusException(HttpStatus.CREATED, "La persona no existe");
    }

    @PutMapping("/{id}")
    public void modificar(@PathVariable int id, Persona modificada) {}

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable int id)   {
        p.borrar(id);

    }

}
