public class Partido {

    private String equipo1;
    private int goles1;
    private String equipo2;
    private int goles2;

    public Partido(String equipo1, int goles1, String equipo2, int goles2) {
        this.equipo1 = equipo1;
        this.goles1 = goles1;
        this.equipo2 = equipo2;
        this.goles2 = goles2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public int getGoles1() {
        return goles1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public int getGoles2() {
        return goles2;
    }
}
