import java.util.Scanner;

public class Menu {
    private Scanner sc;
    public Menu(Scanner sc) {
        this.sc = sc;
    }
    public void presentar(String opcion1, Opcion codigo1, String opcion2, Opcion codigo2) {
        System.out.println("1- " + opcion1);
        System.out.println("2- " + opcion2);
        System.out.println("3- Salir");

        System.out.print("Ingrese la opción: ");
        int opcion = sc.nextInt();

        while(opcion != 3) {
            switch (opcion) {
                case 1:
                    codigo1.ejecutar();
                    break;
                case 2:
                    codigo2.ejecutar();
                    break;
            }
            System.out.println("1- " + opcion1);
            System.out.println("2- " + opcion2);
            System.out.println("3- Salir");

            System.out.print("Ingrese la opción: ");
            opcion = sc.nextInt();
        }
    }

    public void presentar(String[]textos, Opcion []codigos) {

        int salir =  textos.length+1;
        for (int i = 0; i < textos.length; i++) {
            System.out.println((i+1) + "- " + textos[i]);
        }
        System.out.println(salir + "- Salir");

        System.out.print("Ingrese la opción: ");
        int opcion = sc.nextInt();

        while(opcion != salir) {

            codigos[opcion-1].ejecutar();

            for (int i = 0; i < textos.length; i++)
                System.out.println((i+1) + "- " + textos[i]);

            System.out.println(salir + "- Salir");
            System.out.print("Ingrese la opción: ");
            opcion = sc.nextInt();
        }
    }
}
