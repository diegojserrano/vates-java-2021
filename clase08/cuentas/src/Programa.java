public class Programa {

    public static void main(String[] args) {

        Cuenta c1 = new CajaAhorro(124,"Juan");
        Cuenta c2 = new CuentaCorriente(124,"Juan", 5000);
        Cuenta c3 = new Cuenta(124,"Juan");

        Cuenta []v = { c1, c2, c3 };

        for(Cuenta c: v) {
            // Funciona de formas diferentes: polimorfismo!

            realizarOperaciones(c); // Llamada polimórfica
        }

        for (Cuenta c: v)
            System.out.println(c.getSaldo());
    }

    public static void realizarOperaciones(Cuenta c) {
        c.depositar(500);
        c.extraer(1000);
    }
}
