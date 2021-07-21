import java.util.Scanner;

public class Programa2 {

    // Cargar por teclado los datos de tres personas
    // Mostrar todos los datos de la persona más joven
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Persona per1, per2, per3;

        System.out.println("Ingrese nombre, apellido y año de nacimiento");
        per1 = new Persona();
        per1.setNombre(sc.next());
        per1.setApellido(sc.next());
        per1.setNacimiento(sc.nextInt());

        System.out.println("Ingrese nombre, apellido y año de nacimiento");
        per2 = new Persona();
        per2.setNombre(sc.next());
        per2.setApellido(sc.next());
        per2.setNacimiento(sc.nextInt());

        System.out.println("Ingrese nombre, apellido y año de nacimiento");
        per3 = new Persona();
        per3.setNombre(sc.next());
        per3.setApellido(sc.next());
        per3.setNacimiento(sc.nextInt());

        Persona masJoven;

        if (per1.getNacimiento() > per2.getNacimiento() && per1.getNacimiento() > per3.getNacimiento())
            masJoven = per1;
        else if (per2.getNacimiento() > per3.getNacimiento())
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
        System.out.println(masJoven.getNombre());
        System.out.println(masJoven.getApellido());
        System.out.println(masJoven.getNacimiento());


    }
}
