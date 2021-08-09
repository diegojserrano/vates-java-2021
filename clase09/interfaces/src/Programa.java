import javax.swing.*;

public class Programa {

    public static void main(String[] args) {
        Anafe a1 = new Anafe();
        Gas a2 = new Gas();

        Articulo v[] = {a1, a2};

        for(int i = 0; i < v.length; i++) {
            if (v[i] instanceof Retornable)
                retornarArticulo((Retornable) v[i]);
            else
                System.out.printf("No es retornable");
        }
    }


    public static void retornarArticulo(Retornable r) {
        r.retornar();
        System.out.println("Devuelto el articulo" + r.toString());
    }
}
