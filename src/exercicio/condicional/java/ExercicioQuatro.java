/* Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */

package exercicio.condicional.java;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main (String args[]){

		Scanner entrada = new Scanner(System.in);
		
			int numero, potencia = 0, raiz;
			
				System.out.println("Insira um número: ");
				numero = entrada.nextInt();
				
				if(numero % 2 == 0) {
					
					numero = (int) Math.sqrt(numero);
					
					System.out.println("\nA raiz quadrada deste número é: " + numero);
					
				} else {
				
					potencia = numero * numero;
					
					System.out.println("\nA potência deste número é: " + potencia);	
				}
	}
}