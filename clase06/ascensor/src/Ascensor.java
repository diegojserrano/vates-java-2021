public class Ascensor {

    private final int pisoInferior;
    private final int pisoSuperior;
    private final int capacidad;

    private int piso; // El piso en que se encuentra
    private int ocupacion; // La cantidad de personas que están adentro

    public Ascensor(int pisoInferior, int pisoSuperior, int capacidad) {
        if (pisoInferior < pisoSuperior) {
            this.pisoInferior = pisoInferior;
            this.pisoSuperior = pisoSuperior;
        } else {
            // Deberia tirarse un error
            this.pisoInferior = 0;
            this.pisoSuperior = 10;
        }
        if (capacidad <= 0)
            this.capacidad = capacidad;
        else
            this.capacidad = 4;

        this.piso = 0;
        this.ocupacion = 0;
    }

    public void setPiso(int nuevoPiso) {
        if (nuevoPiso >= pisoInferior && nuevoPiso <= pisoSuperior)
            piso = nuevoPiso;
        //else => Lanzamiento de un error.
    }

    public int subir(int cantidadPersonas) {
        if (cantidadPersonas <= 0) return 0; // Si es negativo se puede tirar un error
        int puedenEntrar = capacidad - ocupacion;
        int entran = (cantidadPersonas <= puedenEntrar)? cantidadPersonas: puedenEntrar;
        ocupacion += entran;
        return entran;
    }

    public int bajar(int cantidadPersonas) {
        if (cantidadPersonas <= 0) return 0; // Si es negativo se puede tirar un error
        int bajan = (cantidadPersonas <= ocupacion)? cantidadPersonas: ocupacion;
        ocupacion -= bajan;
        return bajan;
    }

    public int getPisoInferior() {
        return pisoInferior;
    }

    public int getPisoSuperior() {
        return pisoSuperior;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPiso() {
        return piso;
    }

    public int getOcupacion() {
        return ocupacion;
    }

    public String toString() {
        return "El ascensor tiene " + ocupacion + " personas y está en el piso " + piso;
    }
}
