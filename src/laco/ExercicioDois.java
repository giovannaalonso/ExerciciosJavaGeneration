//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

package laco;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int contadorPar = 0, contadorImpar = 0, i;
		
		for(int numero = 0; numero < 10; numero++) {
			
			System.out.println("\nInsira o um n�mero: ");
			
			i = entrada.nextInt();
			
			if(i % 2 == 0) {
								
				contadorPar++;
					
			} else {
				
				contadorImpar++;
				
			}
		}
		
		System.out.println("Existem " + contadorPar + " n�meros pares");
		System.out.println("Existem " + contadorImpar + " n�meros impares");
	}
}