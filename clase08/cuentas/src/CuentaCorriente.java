public class CuentaCorriente extends Cuenta {

    private float limite;

    public CuentaCorriente(int numero, String cliente, float limite) {
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public void extraer(float importe) {
        if (importe > 0 && importe <= (saldo + limite))
            saldo -= importe;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "limite=" + limite +
                "} " + super.toString();
    }
}
