package curso.clase27.prueba;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.HashSet;

@ApplicationScope
@Service
public class GestorNumeros {

    private HashSet<Integer> numeros;

    public GestorNumeros() {
        numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(7);
        numeros.add(28);
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
