import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Pruebas para la calculadora")
class CalculadoraTest {



    @Test
    public void pruebaSuma1() {
        assertEquals(Calculadora.sumar(1, 3), 4, "Sumando 1 y 3");
    }

    @Test
    @DisplayName("Sumando dos 0")
    public void pruebaSuma2() {
        assertEquals(Calculadora.sumar(0, 0), 0, "Sumando 0 y 0");
    }

    @Test
    public void pruebaSuma3() {
        assertEquals(0, Calculadora.sumar(1, -1), "Sumando 1 y -1");
    }

    @Test
    public void pruebaDivision1() {
        assertEquals(-1, Calculadora.dividir(1, -1), "Dividiendo 1 y -1");
    }

    @Test
    public void pruebaDivision2() {
        assertEquals(Float.POSITIVE_INFINITY, Calculadora.dividir(1, 0), "Division por cero");
    }

}