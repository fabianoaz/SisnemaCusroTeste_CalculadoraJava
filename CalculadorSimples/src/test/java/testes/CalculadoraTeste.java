package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import principal.Calculadora;

class CalculadoraTeste {
	
	Calculadora calc = new Calculadora();

	@Test
	@DisplayName("Soma Positivos")
	void testSomaNumerosPositivos_ResultadoPositivo() {
		assertEquals(5, calc.soma(3, 2));
	}
	
	@Test
	@DisplayName("Soma Negativos")
	void testSomaNumerosNegativos_ResultadoPositivo() {
		assertEquals(-5, calc.soma(-3, -2));
	}
	
	@Test
	@DisplayName("Subtração Positivos")
	void testSubtraiNumerosPositivos_ResultadoPositivo() {
		assertEquals(1, calc.subtrai(3, 2));
	}
	
	@Test
	@DisplayName("Subtração Negativos")
	void testSubtraiNumerosNegativos_ResultadoPositivo() {
		assertEquals(-1, calc.subtrai(-3, -2));
	}
	
	@Test
	@DisplayName("Divisão Positivos")
	void testDivideNumerosPositivos_ResultadoPositivo() {
		assertEquals(5, calc.divide(10, 2));
	}
	

}
