// Faça um programa que receba três inteiros e diga qual deles é o maior.

package condicional;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main (String args[]){

		Scanner entrada = new Scanner(System.in);
		
			int a,b,c;
			
				System.out.println("\nInsira um número inteiro: ");
				a = entrada.nextInt();
				System.out.println("\nInsira outro número inteiro: ");
				b = entrada.nextInt();
				System.out.println("\nInsira outro número inteiro: ");
				c = entrada.nextInt();
				
				if(a>b && a>c) {
					System.out.println(" O maior número é: " + a);
				}
				else if (b>a && b>c) {
					System.out.println("O maior número é: " + b);
				}
				else {
					System.out.println("O maior número é: " + c);
				}
			}
}
