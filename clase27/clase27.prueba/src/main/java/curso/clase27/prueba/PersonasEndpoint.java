package curso.clase27.prueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@RestController
@RequestMapping("/personas")
public class PersonasEndpoint {

    @Autowired
    private ListaPersonas lista;

    @GetMapping("/todas")
    public Collection<Persona> todas() {
        return lista.obtenerTodas();
    }

    @GetMapping("/{documento}")
    public Persona una(@PathVariable int documento) {
        Persona encontrada = lista.obtener(documento);
        if (encontrada == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    String.format("La persona %d no existe", documento));
        return encontrada;
    }

    @PostMapping("/{documento}")
    public String agregar(@RequestBody Persona nueva) {
        lista.agregar(nueva);
        return "Persona " + nueva.toString() + " agregada";
    }

}
