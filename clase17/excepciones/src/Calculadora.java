public class Calculadora {

    public float calcular() {
        float cociente = 0;

        try {  // bloque de curso normal

            int numerador = 34;
            int denominador = 4 - 4;

            cociente = numerador / denominador;
            // genera OTRA excepcion no capturada

        } catch(ArithmeticException ex1) { // bloque de curso alternativo
            //System.out.println("No puedo continuar, hay una division por cero");
            cociente = -1;
        }

        return cociente;

    }
}
