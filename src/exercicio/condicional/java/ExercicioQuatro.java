/* Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado. */

package exercicio.condicional.java;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main (String args[]){

		Scanner entrada = new Scanner(System.in);
		
			int numero, potencia = 0, raiz;
			
				System.out.println("Insira um n�mero: ");
				numero = entrada.nextInt();
				
				if(numero % 2 == 0) {
					
					numero = (int) Math.sqrt(numero);
					
					System.out.println("\nA raiz quadrada deste n�mero �: " + numero);
					
				} else {
				
					potencia = numero * numero;
					
					System.out.println("\nA pot�ncia deste n�mero �: " + potencia);	
				}
	}
}