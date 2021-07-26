public class Examen {

    private float porcentajeTeorico;
    private float porcentajePractico;

    public Examen(float porcentajeTeorico, float porcentajePractico) {
        this.porcentajeTeorico = porcentajeTeorico;
        this.porcentajePractico = porcentajePractico;
    }

    public float getPorcentajeTeorico() {
        return porcentajeTeorico;
    }

    public float getPorcentajePractico() {
        return porcentajePractico;
    }

    public void setPorcentajeTeorico(float porcentajeTeorico) {
        this.porcentajeTeorico = porcentajeTeorico;
    }

    public void setPorcentajePractico(float porcentajePractico) {
        this.porcentajePractico = porcentajePractico;
    }

    public int getNota() {
        if (porcentajePractico < 55 || porcentajeTeorico < 55) return 2;
        float promedio = (porcentajePractico + porcentajeTeorico) / 2f;
        int nota = 4;
        if (promedio > 95) nota = 10;
        else if (promedio >= 86) nota = 9;
        else if (promedio >= 77) nota = 8;
        else if (promedio >= 65) nota = 7;
        else if (promedio >= 60) nota = 6;
        else if (promedio >= 58) nota = 5;
        return nota;
    }

    public boolean aprobado() {
        return getNota() >= 4;
    }
}
