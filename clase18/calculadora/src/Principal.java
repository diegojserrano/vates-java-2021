import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;
import java.util.function.ToDoubleBiFunction;


public class Principal {

    public static void main(String[] args) {

        Map<String, DoubleBinaryOperator> operaciones = new HashMap<>();
        //Map<String, Operacion> operaciones = new HashMap<>();

        operaciones.put("+", (a,b) -> a+b );
        operaciones.put("-", (a,b) -> a-b );
        operaciones.put("*", (a,b) -> a*b );
        operaciones.put("/", (a,b) -> a/b );

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la operación");
        double x = sc.nextDouble();
        String op = sc.next();
        double y = sc.nextDouble();

        System.out.println(operaciones.get(op).applyAsDouble(x, y));
        //System.out.println(operaciones.get(op).calcular(x, y));

    }
}
