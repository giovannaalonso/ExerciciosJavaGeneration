// Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

package condicional;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main (String args[]){

		Scanner entrada = new Scanner(System.in);
		
			int a,b,c;
			
				System.out.println("\nInsira um n�mero inteiro: ");
				a = entrada.nextInt();
				System.out.println("\nInsira outro n�mero inteiro: ");
				b = entrada.nextInt();
				System.out.println("\nInsira outro n�mero inteiro: ");
				c = entrada.nextInt();
				
				if(a>b && a>c) {
					System.out.println(" O maior n�mero �: " + a);
				}
				else if (b>a && b>c) {
					System.out.println("O maior n�mero �: " + b);
				}
				else {
					System.out.println("O maior n�mero �: " + c);
				}
			}
}
