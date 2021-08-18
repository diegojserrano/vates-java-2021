public class Coleccion implements Iterable {

    Comparable v[];
    private int cantidad = 0;

    public Coleccion() {
        v = new Comparable[10];
    }

    public void agregar(Comparable nuevo) {
        if (v[v.length - 1] != null)
            redimensionar(v.length * 2);

        cantidad++;
        for(int i = 0; i < v.length; i++) {
            if (v[i] == null) {
                v[i] = nuevo;
                return;
            }
        }
    }

    // Borre del arreglo el objeto o
    // buscandolo por valor, con comparable
    public void borrar(Comparable o) {
        for(int i =  0; i < v.length; i++) {
            if (v[i] != null && v[i].compareTo(o) == 0) {
                v[i] = null;
                break;
            }
        }

        cantidad --;
        if (cantidad < (v.length / 2) && v.length > 10) {
            redimensionar(v.length / 2);
        }
    }

    private void redimensionar(int nuevoTamaño) {
        Comparable []temp = new Comparable[nuevoTamaño];
        int j = 0;

        for (Comparable c: v) {
            if (c != null)
                temp[j++] = c;
        }

        v = temp;
    }
    //Busque el objecto o comparando con compareTo.
    // Si encuentra un objeto que comparado con o
    // diga que son iguales, lo retorne
    // Si no, que retorne null.
    public Object buscar(Comparable buscado) {
        for (Comparable c: v) {
            if (c != null && c.compareTo(buscado) == 0) {
                return c;
            }
        }
        return null;
    }

    // Lo mismo que buscar pero devolviendo true o false.
    public boolean existe(Comparable buscado) {
        return buscar(buscado) != null;
    }

    public void ordenar() {
        for (int i = 0; i < v.length-1; i++)
            for (int j = i+1; j < v.length; j++)
                if (v[j] != null && (v[i] == null || v[i].compareTo(v[j]) > 0)) {
                    Comparable aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
    }


    public IteradorColeccion iterator() {
        IteradorColeccion it = new IteradorColeccion(this);
        return it;
    }

}
