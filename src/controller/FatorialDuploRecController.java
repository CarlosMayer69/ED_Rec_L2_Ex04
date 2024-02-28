/*
* 4. 
* Faça uma função recursiva em Java 
* que receba um número inteiro positivo ímpar N e 
* retorne o fatorial duplo desse número 
* (A entrada deve ser validada fora da função recursiva). 
* O fatorial duplo é definido como 
* o produto de todos os números naturais ímpares de 1 até 
* algum número natural ímpar N. 
* Assim, o fatorial duplo de 5 é: 
* 5!! = 1 * 3 * 5 = 15
*/
 
package controller;
 
public class FatorialDuploRecController {
 
	public FatorialDuploRecController() {
		
		super();
		
	}
	
		// Ponto de parada: O fatorial duplo de 1 é 1
	    public static long calcularFatorialDuplo(int n) {
	        if (n == 1) {
	            return 1;
	        }
	     // Chamada recursiva: 
	     // Multiplica o número atual pelo fatorial duplo 
	     // do número ímpar anterior (n - 2)
	        return n * calcularFatorialDuplo(n - 2);
	    }
	    
}
