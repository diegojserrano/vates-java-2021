public class Coleccion implements Iterable {

    Comparable v[];

    public Coleccion(int cantidadElementos) {
        v = new Comparable[cantidadElementos];
    }

    public void agregar(Comparable nuevo) {
        for(int i = 0; i < v.length; i++)
            if (v[i] == null) {
                v[i] = nuevo;
                return;
            }
    }

    // Borre del arreglo el objeto o
    // buscandolo por valor, con comparable
    public void borrar(Comparable o) {}

    //Busque el objecto o comparando con compareTo.
    // Si encuentra un objeto que comparado con o
    // diga que son iguales, lo retorne
    // Si no, que retorne null.
    public Object buscar(Comparable o) { return null; }

    // Lo mismo que buscar pero devolviendo true o false.
    public boolean existe(Comparable o) { return true; }


    public IteradorColeccion iterator() {
        IteradorColeccion it = new IteradorColeccion(this);
        return it;
    }

}
