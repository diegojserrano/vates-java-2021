public class Persona {

    // Modificadores de acceso:
    // public
    // private
    // vacio (por defecto)
    // protected

    // Atributos
    private String nombre;
    private String apellido;
    private int nacimiento;
    private static int cantidadInstancias = 0;

    // Métodos
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
        if (!apellido.isBlank())
            this.apellido = apellido;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public int getEdad() {
        return 2021 - nacimiento;
    }

    public Persona() {
        nombre = apellido = "No especificado";
        nacimiento = 2000;
    }

    public static int getCantidadInstancias() {
        return cantidadInstancias;
    }

    public Persona(String nombre, String apellido, int nacimiento) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.cantidadInstancias++;
    }
}
