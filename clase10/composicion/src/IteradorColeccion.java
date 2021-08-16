import java.util.Iterator;

public class IteradorColeccion implements Iterator {

    Coleccion col;
    private int indiceProximo = -1;

    IteradorColeccion(Coleccion col) {
        this.col = col;
        calcularProximoIndice();

    }

    private void calcularProximoIndice() {
        indiceProximo++;
        while (indiceProximo < col.v.length && col.v[indiceProximo] == null)
            indiceProximo++;
    }

    public Object next() {
        Object retorno = col.v[indiceProximo];
        calcularProximoIndice();
        return retorno;
    }

    public boolean hasNext() {
        return indiceProximo < col.v.length;
    }


}
