public class Cliente {

    // Los miembros protected son
    // Accesibles desde la clase y sus derivadas
    // Inaccesibles desde cualquier otra
    protected int numero;
    protected String nombre;

    public Cliente() {
    }

    public Cliente(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero >= 0)
            this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Soy el tostring de Cliente{" +
                "numero=" + numero +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
