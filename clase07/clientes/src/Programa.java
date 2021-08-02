public class Programa {

    public static void main(String[] args) {

        ClienteWeb c = new ClienteWeb(23, "Juan Perez" ,"asdfasd","asdf@sadf");

        System.out.println(c.getNumero());
        System.out.println(c.getNombre());
        System.out.println(c.getUsername());
        System.out.println(c.getEmail());
    }
}
