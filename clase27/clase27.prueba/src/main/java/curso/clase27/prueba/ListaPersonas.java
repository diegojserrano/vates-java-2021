package curso.clase27.prueba;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@ApplicationScope
@Service
public class ListaPersonas {

    public ListaPersonas() {
        personas = new HashMap<>();
        personas.put(1, new Persona(1, "Juan", "Perez", 23));
        personas.put(3, new Persona(3, "Ju", "Pereza", 23));
    }

    private HashMap<Integer, Persona> personas;

    public void agregar(Persona nueva) {
        personas.put(nueva.getDocumento(), nueva);
    }

    public Persona obtener(int documento) {
        return personas.get(documento);
    }

    public Collection<Persona> obtenerTodas() {
        return personas.values();
    }


}
