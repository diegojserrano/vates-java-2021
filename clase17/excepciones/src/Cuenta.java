public class Cuenta {

    private int numero;
    private String nombre;
    private float saldo;

    public Cuenta(int numero, String nombre) {
        setNumero(numero);
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) throw new IllegalArgumentException("El numero de cuenta debe ser positivo");
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(int monto) {
        if (monto <= 0) throw new IllegalArgumentException("El monto no puede ser negativo");
        saldo += monto;
    }

    public void extraer(int monto) {
        if (monto <= 0) throw new IllegalArgumentException("El monto no puede ser negativo");
        if (monto > saldo) throw new SaldoNegativoException("La cuenta quedaría con " + (saldo-monto));
        saldo -= monto;
    }


}
