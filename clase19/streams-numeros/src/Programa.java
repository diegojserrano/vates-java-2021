import java.util.Random;
import java.util.stream.Stream;

public class Programa {

    public static void main(String[] args) {
        Random r = new Random();
        //Stream.generate(() -> r.nextInt(1000))

         int suma = Stream.iterate(0, x -> x +1)
                .skip(6)
                .limit(10)
                .map(x -> x * x)
                .filter(x -> x > 9 && x < 100)
                .reduce(0,(a,b) -> a+b);
        
         System.out.println(suma);


    }
}
