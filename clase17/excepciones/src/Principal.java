import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;
import java.sql.SQLException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Calculadora c = new Calculadora();
        //System.out.println(c.calcular());

        Cuenta c = new Cuenta(23,"Juan");

        c.depositar(1000);
        c.extraer(2000);

        try {
            Scanner sc = new Scanner(new File("aaaa.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
