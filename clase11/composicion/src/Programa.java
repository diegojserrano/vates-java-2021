public class Programa {

    public static void main(String[] args) {
        Coleccion c = new Coleccion();


        c.agregar("Lunes");
        c.agregar("Martes");
        c.agregar("Miercoles");
        c.agregar("Jueves");
        c.agregar("Viernes");
        c.agregar("Sabado");

        c.ordenar();
        //Por cada object o que pertenezca a c
        for(Object o: c) {
            System.out.println(o);
        }

        System.out.println(c.existe("Domingo"));

        c.borrar("Viernes");
        c.borrar("Viernes");
        c.borrar("Viernes");

        for(Object o: c) {
            System.out.println(o);
        }


        Coleccion num = new Coleccion();
        for (int i = 0; i < 2000; i++)
            num.agregar(i);

        for(Object o: num)
            System.out.println(o);

        int x = 0;
        try {
            for (x = 180; x < 1800; x++)
                num.borrar(x);
        }
        catch(Exception e) {
            System.out.println("Al borrar " + x );
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Después del borrado");
            for(Object o: num)
                System.out.println(o);

        }


    }

}
