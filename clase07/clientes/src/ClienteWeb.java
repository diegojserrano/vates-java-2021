public class ClienteWeb extends Cliente {

    private String username;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void metodo() {
        System.out.println(numero);
    }

    public ClienteWeb() {
     // El compilador implícitamente llama
     // al constructor sin parámetros de la clase base
    }

    public ClienteWeb(int numero, String nombre, String username, String email) {
        super(numero, nombre);
        this.username = username;
        this.email = email;
    }
}
