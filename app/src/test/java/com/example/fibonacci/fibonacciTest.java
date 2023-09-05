package com.example.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class fibonacciTest {
    @Test
    public void casosIguales(){

        int resultado = Fibonacci.Calcular(1);
        assertEquals(1, resultado);
    }

    @Test
    public void casoNormal(){

        int resultado = Fibonacci.Calcular(10);
        assertEquals(55, resultado);
    }

    

}
