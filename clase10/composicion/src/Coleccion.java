public class Coleccion implements Iterable {

    Object v[];

    public Coleccion(int cantidadElementos) {
        v = new Object[cantidadElementos];
    }

    public void agregar(Object nuevo) {
        for(int i = 0; i < v.length; i++)
            if (v[i] == null) {
                v[i] = nuevo;
                return;
            }
    }

    public IteradorColeccion iterator() {
        IteradorColeccion it = new IteradorColeccion(this);
        return it;
    }

}
