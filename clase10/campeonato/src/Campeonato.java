import java.util.Arrays;
import java.util.Collections;


public class Campeonato {

    private String nombre;
    private Equipo[] equipos;
    private int cantidad;

    public Campeonato(String nombre, int cantidadEquipos) {
        this.nombre = nombre;
        equipos = new Equipo[cantidadEquipos];
    }

    public void agregarEquipo(Equipo nuevo) {
        equipos[cantidad++] = nuevo;
    }

    private Equipo buscar(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (equipos[i] != null && equipos[i].getNombre().equals(nombre))
                return equipos[i];
        }

        return null;
    }

    public void registrarPartido(Partido nuevo) {
        Equipo e1 = buscar(nuevo.getEquipo1());
        Equipo e2 = buscar(nuevo.getEquipo2());

        e1.registrarPartido(nuevo.getGoles1(), nuevo.getGoles2());
        e2.registrarPartido(nuevo.getGoles2(), nuevo.getGoles1());
    }

    public String resultado() {
        Arrays.sort(equipos, Collections.reverseOrder());

        StringBuilder salida = new StringBuilder();

        salida.append(nombre + "\n");
        for (int i = 0; i < cantidad; i++) {
            salida.append((i+1) + ") " + equipos[i].toString() + "\n");
        }

        return salida.toString();
    }

}
