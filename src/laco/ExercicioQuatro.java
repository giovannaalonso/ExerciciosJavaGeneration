/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/

package laco;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int numero, soma = 0;
		
					
				do {
					
					System.out.println("\nInsira um n�mero: ");
					numero = entrada.nextInt();
					
					soma = soma + numero;
									
				} while (numero != 0); {
	}
				System.out.println("A soma dos n�meros informados �: ");

	}
}