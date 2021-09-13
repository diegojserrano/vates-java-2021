import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        new Principal().mostrarMenu();
    }

    private void mostrarMenu() {
        Scanner sc = new Scanner(System.in);

        Menu m = new Menu(sc);

        m.presentar(new String[]{"Bienvenida", "Despedida", "Mostrar numero al azar.."},
                new Opcion[]{
                        () -> System.out.println("Hola desde la anonima"),
                        () -> System.out.println("Chau desde la anonima"),
                        () -> {
                            int r = new Random().nextInt(1000000);
                            System.out.println("Número al azar " + r);
                        }
                });
    }


}
