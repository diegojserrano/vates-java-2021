import java.util.*;

public class Programa {
    public static void main(String[] args) {

        Set<Integer> numeros = new TreeSet<>();

        Random r = new Random();

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            numeros.add(r.nextInt(1000000));
        }
        System.out.println("Elementos: " + numeros.size());

        long fin = System.currentTimeMillis();
        long duracion = fin - inicio;

        System.out.println("Carga:" + duracion);
        int c = 0;
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            if (numeros.contains(r.nextInt(1000000)))
                c++;
        }
        fin = System.currentTimeMillis();
        duracion = fin - inicio;
        System.out.println("Encontro " + c + " en " + duracion);

        for (Integer x: numeros)
            System.out.println(x);
    }
}
