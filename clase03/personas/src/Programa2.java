import java.util.Scanner;

public class Programa2 {

    // Cargar por teclado los datos de tres personas
    // Mostrar todos los datos de la persona más joven
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona per1, per2, per3;

        System.out.println("Ingrese nombre, apellido y año de nacimiento");
        per1 = new Persona();
        per1.nombre = sc.next();
        per1.apellido = sc.next();
        per1.nacimiento = sc.nextInt();

        System.out.println("Ingrese nombre, apellido y año de nacimiento");
        per2 = new Persona();
        per2.nombre = sc.next();
        per2.apellido = sc.next();
        per2.nacimiento = sc.nextInt();

        System.out.println("Ingrese nombre, apellido y año de nacimiento");
        per3 = new Persona();
        per3.nombre = sc.next();
        per3.apellido = sc.next();
        per3.nacimiento = sc.nextInt();

        Persona masJoven;

        if (per1.nacimiento > per2.nacimiento && per1.nacimiento > per3.nacimiento)
            masJoven = per1;
        else if (per2.nacimiento > per3.nacimiento)
            masJoven = per2;
        else
            masJoven = per3;


/*        masJoven = (per1.nacimiento > per2.nacimiento && per1.nacimiento > per3.nacimiento)? per1 :
                (per2.nacimiento > per3.nacimiento) ? per2: per3;
*/
        /*
        masJoven = (per1.nacimiento > per2.nacimiento) ? per1: per2;
        masJoven = (masJoven.nacimiento > per3.nacimiento) ? masJoven: per3;
        */

        System.out.println("Datos de la persona más joven");
        System.out.println(masJoven.nombre);
        System.out.println(masJoven.apellido);
        System.out.println(masJoven.nacimiento);


    }
}
