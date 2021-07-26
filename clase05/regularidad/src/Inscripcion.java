public class Inscripcion {

    private Examen parcial1;
    private Examen parcial2;
    private Examen recuperatorio;

    public Inscripcion() {

    }

    public Examen getParcial1() {
        return parcial1;
    }

    public void setParcial1(Examen parcial1) {
        this.parcial1 = parcial1;
    }

    public Examen getParcial2() {
        return parcial2;
    }

    public void setParcial2(Examen parcial2) {
        this.parcial2 = parcial2;
    }

    public Examen getRecuperatorio() {
        return recuperatorio;
    }

    public void setRecuperatorio(Examen recuperatorio) {
        this.recuperatorio = recuperatorio;
    }

    public String getCondicion() {

        if (aprobado(parcial1) && aprobado(parcial2) &&
            parcial1.getNota() >= 8 && parcial2.getNota() >= 8)
            return "Aprobado";

        if (!aprobado(parcial1) && !aprobado(parcial2))
            return "Libre";

        if ((!aprobado(parcial1) || !aprobado(parcial2)) && !aprobado(recuperatorio))
            return "Libre";

        return "Regular";
    }

    private boolean aprobado(Examen e) {
        return e != null && e.aprobado();
    }

}
