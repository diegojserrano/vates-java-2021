package curso.clase27.prueba;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class ListaPersonas {

    private static ListaPersonas instancia;

    public static ListaPersonas getInstance() {
        if (instancia == null) instancia = new ListaPersonas();
        return instancia;
    }

    private ListaPersonas() {
        personas = new HashMap<>();
        personas.put(1, new Persona(1, "Juan", "Perez", 23));
        personas.put(2, new Persona(2, "Juana", "Perez", 23));
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
