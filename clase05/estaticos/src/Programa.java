public class Programa {

    public static void main(String[] args) {

        Persona per1 = new Persona("per1","ape1", 1911);
        Persona per2 = new Persona("per2","ape2", 1922);
        Persona per3 = new Persona("per2","ape2", 1922);

        GestorPersonas.obtenerInstancia().agregarPersona(per1);
        GestorPersonas.obtenerInstancia().agregarPersona(per2);
        GestorPersonas.obtenerInstancia().agregarPersona(per3);

        System.out.println(Persona.getCantidadInstancias());

    }

}
