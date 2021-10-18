package curso.clase27.prueba;

import java.util.HashSet;

public class GestorNumeros {

    private static GestorNumeros instancia;

    public static GestorNumeros getInstance() {
        if (instancia == null) instancia = new GestorNumeros();
        return instancia;
    }

    private HashSet<Integer> numeros;

    private GestorNumeros() {
        numeros = new HashSet<>();
    }

    public void agregar(int x) {
        numeros.add(x);
    }

    public boolean existe(int x) {
        return numeros.contains(x);
    }

    public void eliminar(int x) {
        numeros.remove(x);
    }

    public int[] listar () {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

}
