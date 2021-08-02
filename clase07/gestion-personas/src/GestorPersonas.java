public class GestorPersonas {

    private Persona[] v;
    private int cantidad;

    public GestorPersonas() {
        v = new Persona[2000];
        cantidad = 0;
    }

    public void agregarPersona(Persona nueva) {
        if (cantidad < v.length && nueva != null) {
            v[cantidad++] = nueva;
        }
    }

    public int contarMayoresDe(int minima) {
        int c = 0;
        for(Persona p: v) {
            if (p != null && p.getEdad() > minima) {
                c++;
            }
        }

        return c;
    }

    public String listado() {
        StringBuilder salida = new StringBuilder();

        for (Persona p: v) {
            if (p != null)
                salida.append(p.toString() + "\n");
        }

        return salida.toString();
    }

    public Persona[] personasConApellido(String apellido) {

        int c = 0;
        for (Persona p: v) {
            if (p != null && p.getApellido().equals(apellido))
                c++;
        }

        Persona[] filtradas = new Persona[c];
        c = 0;
        for (Persona p: v) {
            if (p != null && p.getApellido().equals(apellido))
                filtradas[c++] = p;
        }

        return filtradas;
    }

    public double promedioTerminadosEn(int ultimoDigito) {
        int suma = 0;
        int c = 0;

        for (Persona p: v) {
            if (p != null && p.getDocumento() % 10 == ultimoDigito) {
                suma += p.getEdad();
                c++;
            }
        }

        double promedio = 0;
        if (c > 0)
            promedio = (double) suma / c;

        return promedio;
    }

    public double varianzaEdadesTerminadosEn(int ultimoDigito) {
        double promedio = promedioTerminadosEn(ultimoDigito);
        double suma = 0;
        int c = 0;
        for (Persona p: v) {
            if (p != null && p.getDocumento() % 10 == ultimoDigito) {
                suma += Math.pow(p.getEdad()-promedio,2);
                c++;
            }
        }

        return suma / (c-1);
    }

    public Persona mayorEdad() {
        Persona mayor = null;

        for(Persona p: v) {
            if (p != null && (mayor == null || p.getEdad() >= mayor.getEdad())) {
                mayor = p;
            }
        }

        return mayor;
    }
}
