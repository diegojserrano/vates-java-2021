public class Programa {

    public static void main(String[] args) {

        Banco b = new Banco();
        Cuenta c1 = new CajaAhorro(124,"Juan");
        Cuenta c2 = new CuentaCorriente(345,"Juan", 5000);
        Cuenta c3 = new CajaAhorro(774,"Juan");

        b.agregarCuenta(c1);
        b.agregarCuenta(c2);
        b.agregarCuenta(c3);

        b.depositarATodas(500);
        b.extraerDeTodas(1000);
        System.out.println(b.listarSaldos());

    }

}
