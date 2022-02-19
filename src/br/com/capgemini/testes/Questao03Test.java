package br.com.capgemini.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.capgemini.desafio.Questao03;

public class Questao03Test {

	@Test
	public void testPalavraOvo() {
		int resultadoEsperado = 2;
		int resultadoRetornado = Questao03.contaAnagramas("ovo");
		assertEquals(resultadoEsperado, resultadoRetornado);
	}
	
	@Test
	public void testPalavraAleatoria() {
		int resultadoEsperado = 3;
		int resultadoRetornado = Questao03.contaAnagramas("ifailuhkqq");
		assertEquals(resultadoEsperado, resultadoRetornado);
	}
	
	@Test
	public void testPalavraArara() {
		int resultadoEsperado = 12;
		int resultadoRetornado = Questao03.contaAnagramas("arara");
		assertEquals(resultadoEsperado, resultadoRetornado);
	}
}
