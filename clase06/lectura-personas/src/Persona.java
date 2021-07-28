public class Persona {

    private int documento;
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(int documento, String nombre, String apellido, int edad) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String toString() {
        return documento + " " + nombre + " " + apellido + " " + edad;
    }
}
