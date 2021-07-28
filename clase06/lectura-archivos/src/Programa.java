import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("numeros.txt"));

            int suma = 0;
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                suma += a;
            }

            System.out.println("La suma es:" + suma);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
