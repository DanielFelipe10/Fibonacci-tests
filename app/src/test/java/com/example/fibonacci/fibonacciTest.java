package com.example.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fibonacciTest {
    @Test
    public void testCalcularConCasoBase() {

        int resultado = Fibonacci.Calcular(0);
        assertEquals(0, resultado);

        resultado = Fibonacci.Calcular(1);
        assertEquals(1, resultado);
    }
}
