import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Apuesta {
    private HashSet<Integer> apostados;

    public Apuesta(Collection<Integer> apostados) {
        this.apostados = new HashSet<>(apostados);
    }

    public boolean ganadora(Set<Integer> sorteados) {
        return aciertos(sorteados) == 6;
    }

    public boolean acerto5(Set<Integer> sorteados) {
        return aciertos(sorteados) == 5;
    }

    public boolean acerto4(Set<Integer> sorteados) {
        return aciertos(sorteados) == 4;
    }

    public int aciertos(Set<Integer> sorteados) {
        Set<Integer> acertados = new HashSet<Integer>(apostados);
        acertados.retainAll(sorteados); // Interseccion no destructiva
        return acertados.size();
    }


}
