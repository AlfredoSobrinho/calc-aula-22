package calculator

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculadoraTest {

    @Test
    fun adicaoTest() {
        assertEquals(4.0, Calculadora.adicao(2.0, 2.0))
    }

    @Test
    fun subtracaoTest() {
        assertEquals(6.0, Calculadora.subtracao(10.0, 4.0))
    }

    @Test
    fun divisaoTest() {
        assertEquals(2.0, Calculadora.divisao(10.0, 5.0))
    }

    @Test
    fun multiplicaoTest() {
        assertEquals(6.0, Calculadora.multiplicacao(3.0, 2.0))
    }
}

