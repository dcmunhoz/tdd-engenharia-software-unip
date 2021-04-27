package br.edu.unip.aula.testes_engenharia_software;


/**
 * Hello world!
 *
 */
public class App 
{ 
    public static void main( String[] args )
    {
    	System.out.println("Calculadora");
    	
    	Calculadora calc = new Calculadora();
    	
    	Integer resultado = calc.Somar(3, 7);
    	
    	System.out.println("Resultado: " + resultado);
    }
}
