import java.io.FileWriter;
import java.io.IOException;

public class Programa {

    public static void main(String[] args) {

        //try with resources
        try (FileWriter fw = new FileWriter("texto1.txt",true)) {

            fw.write("Soy un archivo nuevo\r\n");
            fw.write("Tengo dos lineas");

            int documento = 23252345;
            String apellido = "Perez";
            String nombre = "Juan";

            fw.write(String.format("%d,%s,%s", documento, apellido, nombre));

        } catch(IOException e) {

        }
    }

}
