package view;
 
import controller.FatorialDuploRecController;
 
public class Principal {
 
	public static void main(String[] args) {

		int n = 5; // Aqui podemos substituir por n�mero(s) inteiro(s)
		//positivo(s) �mpar(es), conforme desejado.
		//int n = 3; //TESTE
		//int n = 4; //TESTE
		
		FatorialDuploRecController fdr = new FatorialDuploRecController();
        
		if (n % 2 == 0) {
            System.out.println("O n�mero precisa ser �mpar.");
            return;
        }
 
        long fatorialDuplo = fdr.calcularFatorialDuplo(n);
        System.out.println("Fatorial duplo de " + n + " �: " + fatorialDuplo);
    }
}
