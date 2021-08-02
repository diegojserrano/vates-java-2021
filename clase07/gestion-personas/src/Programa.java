import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        GestorPersonas gestor = new GestorPersonas();
        try {
            Scanner sc = new Scanner(new File("personas2.txt"));
            sc.useDelimiter("[;\\n]");

            Persona []v = new Persona[2000];
            int i = 0;
            while(sc.hasNextInt()) { // Una vuelta por cada linea / persona
                int documento = sc.nextInt();
                String nombre = sc.next();
                String apellido = sc.next();
                int edad = sc.nextInt();

                Persona p = new Persona(documento, nombre, apellido, edad);
                gestor.agregarPersona(p);
                i++;
            }

            System.out.println(gestor.listado());
            System.out.println(gestor.contarMayoresDe(20));
            Persona perez[] = gestor.personasConApellido("PEREZ");
            for(Persona p: perez)
                System.out.println(p.toString());
            System.out.println(gestor.mayorEdad().toString());
            System.out.println(gestor.varianzaEdadesTerminadosEn(0));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
