import java.util.Arrays;

public class Programa {

    public static void main(String[] args) {

        Persona []v = {
                new Persona(124, "Juan", "Perez"),
                new Persona(452, "Facundo", "Ramirez"),
                new Persona(7854, "Susana", "Perez"),
                new Persona(764, "Cesar", "Gimenez")
        };


        Arrays.sort(v);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

    }
}
