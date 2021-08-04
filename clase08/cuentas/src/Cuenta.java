public abstract class Cuenta {
    protected int numero;
    protected String cliente;
    protected float saldo;

    public Cuenta(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public final void depositar(float importe) {
        if (importe > 0)
            saldo += importe;
    }

    public abstract void extraer(float importe);

    @Override
    public String toString() {
        return "Cuenta{" +
                "numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
