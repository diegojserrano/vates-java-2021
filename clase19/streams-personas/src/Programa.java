import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

            IntSummaryStatistics estadisticas = Arrays.stream(v).mapToInt(Persona::getEdad).summaryStatistics();
            System.out.println("El promedio de edades es: " + estadisticas.getAverage());


            List<Integer> l = Arrays.stream(v)
                    .filter(x -> x.getApellido().equals("PEREZ"))
                    .sorted(Comparator.comparing(Persona::getNombre).reversed())
                    .map(Persona::getDocumento)
                    .collect(Collectors.toList());


            Map<String, List<Persona>> m = Arrays.stream(v)
                    .filter(x -> x.getApellido().startsWith("P"))
                    .collect(Collectors.groupingBy(Persona::getApellido));

            for(Map.Entry<String, List<Persona>> apellido: m.entrySet()) {
                System.out.println("\n\nPersonas con apellido: " + apellido.getKey());
                apellido.getValue().stream()
                        .sorted(Comparator.comparing(Persona::getEdad))
                        .forEach(System.out::println);
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
