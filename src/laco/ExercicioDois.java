//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package laco;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contadorPar = 0, contadorImpar = 0, i;
		
		for(int numero = 0; numero < 10; numero++) {
			
			System.out.println("\nInsira o um número: ");
			
			i = entrada.nextInt();
			
			if(i % 2 == 0) {
								
				contadorPar++;
					
			} else {
				
				contadorImpar++;
				
			}
		}
		
		System.out.println("Existem " + contadorPar + " números pares");
		System.out.println("Existem " + contadorImpar + " números impares");
	}
}