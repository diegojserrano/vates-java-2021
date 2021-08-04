public class CajaAhorro extends Cuenta {

    public CajaAhorro(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public void extraer(float importe) {
        if (importe > 0 && importe <= saldo)
            saldo -= importe;
    }
}
