package br.edu.unip.aula.testes_engenharia_software;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void somarComSucesso() {
		Calculadora calc = new Calculadora();
		Integer esperado = 15;
		Integer resultado = calc.Somar(10, 5);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void verificarSituacaoDoAlunoAprovado() {
		Calculadora calc = new Calculadora();
		
		String esperado = "Aprovado";
		
		String resultado = calc.verificarSituacaoAluno(10, 10);
		
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void verificarSituacaoAlunoReprovado() {
		Calculadora calc = new Calculadora();
		
		String esperado = "Reprovado";
		
		String resultado = calc.verificarSituacaoAluno(2.5, 4.5);
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void verificarSituacaoAlunoRecuperacao() {
		Calculadora calc = new Calculadora();
		
		String esperado = "Recuperação";
		
		String resultado = calc.verificarSituacaoAluno(5.5, 4.5);
		
		assertEquals(esperado, resultado);
	}
}
