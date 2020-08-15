package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
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
	@DisplayName("Subtra��o Positivos")
	void testSubtraiNumerosPositivos_ResultadoPositivo() {
		assertEquals(1, calc.subtrai(3, 2));
	}
	
	@Test
	@DisplayName("Subtra��o Negativos")
	void testSubtraiNumerosNegativos_ResultadoPositivo() {
		assertEquals(-1, calc.subtrai(-3, -2));
	}
	
	@Test
	@DisplayName("Divis�o Positivos")
	void testDivideNumerosPositivos_ResultadoPositivo() throws Exception {
		assertEquals(5, calc.divide(10, 2));
	}
	
	@Test
	@DisplayName("Divis�o Negativos")
	void testDivideNumerosNegativos_ResultadoPositivo() throws Exception {
		assertEquals(5, calc.divide(-10, -2));
	}
	
	@Test
	@DisplayName("Divis�o Por Zero")
	void testDividePorZero_ResultadoPositivo() {
		try {
		calc.divide(10, 0);
		}
		catch(Exception e) 
		{
			System.out.println("Falha: " + e.toString());
			Assertions.fail(e.toString());
		}
	}
	
	@Test
	@DisplayName("Multiplica��o Positivos")
	void testMultiplicaNumerosPositivos_ResultadoPositivo() {
		assertEquals(20, calc.multiplica(10, 2));
	}
	
	@Test
	@DisplayName("Multiplica��o Negativos")
	void testMultiplicaNumerosNegativos_ResultadoPositivo() {
		assertEquals(20, calc.multiplica(-10, -2));
	}
	

}
