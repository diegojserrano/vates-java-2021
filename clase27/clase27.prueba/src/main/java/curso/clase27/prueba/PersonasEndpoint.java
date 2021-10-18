package curso.clase27.prueba;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@RestController
@RequestMapping("/personas")
public class PersonasEndpoint {

    @GetMapping("/todas")
    public Collection<Persona> todas() {
        return ListaPersonas.getInstance().obtenerTodas();
    }

    @GetMapping("/{documento}")
    public Persona una(@PathVariable int documento) {
        Persona encontrada = ListaPersonas.getInstance().obtener(documento);
        if (encontrada == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    String.format("La persona %d no existe", documento));
        return encontrada;
    }

    @PostMapping("/{documento}")
    public String agregar(@RequestBody Persona nueva) {
        ListaPersonas.getInstance().agregar(nueva);
        return "Persona " + nueva.toString() + " agregada";
    }

}
