import java.io.File;

public class CalcularTamaño {

    public static void main(String[] args) {

        String carpeta = "../../..";
        String filtro = "personas";

        File d = new File(carpeta);
        buscar(d, filtro);
    }

    private static void buscar (File d, String filtro) {
        long suma = 0;
        try {
            for (File f : d.listFiles()) {
                if (f.isFile() && f.getName().contains(filtro))
                    System.out.println(f.getAbsolutePath());
                else
                    buscar(f, filtro);
            }
        }
        catch(NullPointerException e) {};
    }

}
