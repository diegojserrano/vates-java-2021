public class CajaAhorro extends Cuenta {

    public CajaAhorro(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public final void extraer(float importe) {
        if (importe > 0 && importe <= saldo)
            saldo -= importe;
    }

    @Override
    public String toString() {
        return "CajaAhorro" + super.toString();
    }
}
