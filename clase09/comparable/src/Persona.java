public class Persona implements Comparable {

    private int documento;
    private String nombre;
    private String apellido;

    public Persona(int documento, String nombre, String apellido) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
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
    public int compareTo(Object o) {
        Persona otra = (Persona)o;

        //return this.documento - otra.getDocumento();

        if (!this.apellido.equals(otra.getApellido()))
            return this.apellido.compareTo(otra.getApellido());
        return this.nombre.compareTo(otra.getNombre());
    }
}
