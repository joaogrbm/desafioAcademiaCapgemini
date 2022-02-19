package br.com.capgemini.testes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.capgemini.desafio.Questao02;

public class Questao02Test {

	@Test
	public void testSenhaComTresMinusculas() {
		int resultadoEsperado = 3;
		int resultadoRetornado = Questao02.numeroDeCaracteresNecessarios("aaa");
		assertEquals(resultadoEsperado, resultadoRetornado);
	}
	
	@Test
	public void testSenhaComCaractereEspecialENumero() {
		int resultadoEsperado = 3;
		int resultadoRetornado = Questao02.numeroDeCaracteresNecessarios("1@e");
		assertEquals(resultadoEsperado, resultadoRetornado);
	}
	
	@Test
	public void testSenhaComUmCaractere() {
		int resultadoEsperado = 5;
		int resultadoRetornado = Questao02.numeroDeCaracteresNecessarios("A");
		assertEquals(resultadoEsperado, resultadoRetornado);
	}
	
	@Test
	public void testeSenhaCorreta() {
		int resultadoEsperado = 0;
		int resultadoRetornado = Questao02.numeroDeCaracteresNecessarios("A@3aEx");
		assertEquals(resultadoEsperado, resultadoRetornado);
	}
}
