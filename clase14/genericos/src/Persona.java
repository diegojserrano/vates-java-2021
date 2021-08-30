public class Persona implements Comparable<Persona>  {

    private int documento;
    private String nombre;
    private String apellido;

    public Persona(int documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "documento=" + documento +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }


    @Override
    public int compareTo(Persona persona) {
        return this.documento - persona.documento;
    }
}
