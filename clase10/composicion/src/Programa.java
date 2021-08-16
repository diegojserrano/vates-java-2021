public class Programa {

    public static void main(String[] args) {
        Coleccion c = new Coleccion(10);

        c.agregar("Lunes");
        c.agregar("Martes");
        c.agregar("Miercoles");

        IteradorColeccion it = c.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //Por cada object o que pertenezca a c
        for(Object o: c) {
            System.out.println(o);
        }

    }

}
