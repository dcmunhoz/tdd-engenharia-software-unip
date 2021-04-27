package br.edu.unip.aula.testes_engenharia_software;

public class Calculadora {
	
	public int Somar(int a, int b) {
		int soma = a + b;
		
		return (soma);
	}
	
	public String verificarSituacaoAluno(double n1, double n2) {
		
		Double media = (n1 + n2) / 2;
		
		if (media <= 4) {
			return "Reprovado";
		}else if (media > 4 && media <= 6) {
			return "Recuperação";
		} else {
			return "Aprovado";
		}
		
	}
	
}
