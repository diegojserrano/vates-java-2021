import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

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
                v[i] = p;
                i++;
            }
            int ac = 0;
            for(i = 0; i < v.length; i++) { ac += v[i].getEdad();  }
            float promedio = (float)ac / v.length;
            System.out.println("El promedio de edades es: " + promedio);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
