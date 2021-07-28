public class Programa {

    public static void main(String[] args) {

        Ascensor a1 = new Ascensor(-2,5,10);

        a1.setPiso(4);
        a1.subir(3);
        a1.bajar(5);
        a1.setPiso(10);

        System.out.println(a1.toString());

        a1.setPiso(1);

        System.out.println(a1.toString());

    }
}
