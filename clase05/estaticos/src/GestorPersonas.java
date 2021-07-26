public class GestorPersonas {

    private GestorPersonas() {

    }

    private static GestorPersonas instancia = null;

    public static GestorPersonas obtenerInstancia() {
        if (instancia == null)
            instancia = new GestorPersonas();
        return instancia;
    }

    public void agregarPersona(Persona nueva) {}



}
