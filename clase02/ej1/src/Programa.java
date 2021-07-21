import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos numeros");
        a = sc.nextInt();
        b = sc.nextInt();

        int suma = a + b;
        int diferencia = a - b;
        int producto = a * b;
        float cociente  = (float)a / b;

        System.out.println("Ud. ingreso " + a + " y " + b);
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + diferencia);
        System.out.println("La multiplicacion es: " + producto);
        System.out.println("La division es: " + cociente);

    }

}
