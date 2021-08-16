public class Equipo implements Comparable {

    private String nombre;
    private int puntos;
    private int partidos;
    private int ganados;
    private int empatados;
    private int perdidos;
    private int golesRealizados;
    private int golesRecibidos;

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public int getPartidos() {
        return partidos;
    }

    public int getGanados() {
        return ganados;
    }

    public int getEmpatados() {
        return empatados;
    }

    public int getPerdidos() {
        return perdidos;
    }

    public int getGolesRealizados() {
        return golesRealizados;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void registrarPartido(int golesRealizados, int golesRecibidos) {

        partidos++;
        this.golesRealizados += golesRealizados;
        this.golesRecibidos += golesRecibidos;

        if (golesRealizados > golesRecibidos) {
            puntos += 3;
            ganados ++;
        } else if (golesRealizados == golesRecibidos) {
            puntos += 1;
            empatados++;
        } else {
            perdidos++;
        }
    }

    public int getDiferenciaGol() {
        return golesRealizados - golesRecibidos;
    }

    @Override
    public int compareTo(Object o) {
        Equipo adv = (Equipo) o;

        if (this.puntos != adv.getPuntos()) return this.puntos - adv.getPuntos();
        if (this.ganados != adv.getGanados()) return this.ganados - adv.getGanados();
        if (this.getDiferenciaGol() != adv.getDiferenciaGol()) return this.getDiferenciaGol() - adv.getDiferenciaGol();
        if (this.golesRealizados != adv.getGolesRealizados()) return this.getGolesRealizados() - adv.getGolesRealizados();
        if (this.partidos != adv.getPartidos()) return adv.getPartidos() - this.partidos;
        return -this.nombre.compareTo(adv.getNombre());
    }

    // Team name [b]p, [c]g ([d]-[e]-[f ]), [g]gd ([h]-[i])
    @Override
    public String toString() {
        return nombre +
                " " + puntos +
                "p, " + partidos +
                "g (" + ganados +
                "-" + empatados +
                "-" + perdidos +
                "), " + getDiferenciaGol() +
                "gd (" + golesRealizados +
                "-" + golesRecibidos +
                ')';
    }
}
