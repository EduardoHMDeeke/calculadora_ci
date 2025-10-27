package src.test.java.test;

import org.junit.jupiter.api.Test;

import src.main.java.calculadora.Calculadora;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculadora {
    @Test
    void testGetSoma() {
        Calculadora calc = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calc.getSoma();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetDiferenca() {
        Calculadora calc = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calc.getDiferenca();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetProduto() {
        Calculadora calc = new Calculadora(4.0, 2.0);
        double retornoEsperado = 8.0;
        double retornoFeito = calc.getProduto();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetQuociente() {
        Calculadora calc = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calc.getQuociente();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
