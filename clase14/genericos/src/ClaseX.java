public class ClaseX<E> {

    private E dato1;

    public ClaseX(E dato1) {
        this.dato1 = dato1;
    }

    public E getDato1() {
        return dato1;
    }

    public void setDato1(E dato1) {
        this.dato1 = dato1;
    }

    @Override
    public String toString() {
        return "ClaseX{" +
                "dato1=("+ dato1.getClass().getSimpleName() + ")" + dato1 +
                '}';
    }
}
