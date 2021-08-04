public class Banco {

    private Cuenta []cuentas;
    private int cantidad;

    public Banco() {
        cuentas = new Cuenta[200];
        cantidad = 0;
    }

    public void agregarCuenta(Cuenta nueva) {
        if (nueva != null && cantidad < cuentas.length)
            cuentas[cantidad++] = nueva;
    }

    public String listarSaldos() {
        StringBuilder sb = new StringBuilder();

        for(Cuenta c: cuentas) {
            if (c != null)
                sb.append(c.getNumero() + ": $ " + c.getSaldo() + "\n");
        }
        return sb.toString();
    }

    public void depositarATodas(float importe) {
        for(Cuenta c: cuentas) {
            if (c != null)
                c.depositar(importe);
        }
    }

    public void extraerDeTodas(float importe) {
        for(Cuenta c: cuentas) {
            if (c != null)
                c.extraer(importe);
        }
    }

    public Cuenta buscarCuenta(int numeroBuscado) {
        for(Cuenta c: cuentas) {
            if (c != null && c.getNumero() == numeroBuscado)
                return c;
        }
        return null;
    }

}
