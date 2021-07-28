import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(new File("personas2.txt"));

            sc.useDelimiter("[;\\n]");

            while(sc.hasNextInt()) { // Una vuelta por cada linea / persona
                int documento = sc.nextInt();
                String nombre = sc.next();
                String apellido = sc.next();
                int edad = sc.nextInt();

                Persona p = new Persona(documento, nombre, apellido, edad);

                System.out.println(p.toString());



            }







        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
