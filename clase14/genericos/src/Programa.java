public class Programa {

    public static void main(String[] args) {

        ClaseX<String> obj1 = new ClaseX<>("Hola");

        System.out.println(obj1);

        obj1.setDato1("Chau");
        System.out.println(obj1);

        ClaseX<Integer> obj2 = new ClaseX<>(23);
        System.out.println(obj2);

    }
}
