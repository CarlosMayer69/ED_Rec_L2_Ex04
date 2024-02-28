/*
* 4. 
* Fa�a uma fun��o recursiva em Java 
* que receba um n�mero inteiro positivo �mpar N e 
* retorne o fatorial duplo desse n�mero 
* (A entrada deve ser validada fora da fun��o recursiva). 
* O fatorial duplo � definido como 
* o produto de todos os n�meros naturais �mpares de 1 at� 
* algum n�mero natural �mpar N. 
* Assim, o fatorial duplo de 5 �: 
* 5!! = 1 * 3 * 5 = 15
*/
 
package controller;
 
public class FatorialDuploRecController {
 
	public FatorialDuploRecController() {
		
		super();
		
	}
	
		// Ponto de parada: O fatorial duplo de 1 � 1
	    public static long calcularFatorialDuplo(int n) {
	        if (n == 1) {
	            return 1;
	        }
	     // Chamada recursiva: 
	     // Multiplica o n�mero atual pelo fatorial duplo 
	     // do n�mero �mpar anterior (n - 2)
	        return n * calcularFatorialDuplo(n - 2);
	    }
	    
}
