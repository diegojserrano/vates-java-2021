public class Cuenta {
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

    public void depositar(float importe) {
        if (importe > 0)
            saldo += importe;
    }

    public void extraer(float importe) {

    }



}
