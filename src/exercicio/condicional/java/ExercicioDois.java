// Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

package exercicio.condicional.java;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2,n3, maior = 88, meio = 00 , menor = 77;
		
		System.out.println("\nInsira o primeiro n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("\nInsira o segundo n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("\nInsira o terceiro n�mero: ");
		n3 = entrada.nextInt();
		
		if (n1 >= n3 && n1 >= n2) {
			maior = n1;
		
		} else if (n2 >= n3 && n2 >= n1) {
			maior = n2;
		
		} else if (n3 >= n2 && n3 >= n1) {
			maior = n3;
		
		} 
		
		if (n1 <= n3 && n1 <= n2) {
			menor = n1;
		
		} else if (n2 <= n3 && n2 <= n1) {
			menor = n2;
		
		} else if (n3 <= n1 && n3 <= n2) {
			menor = n3;
		
		} 
		if ( (n1 < n2 || n1 < n3) && (n1 > n2 || n1 > n3)) {
			meio = n1;
			
		} else if ( (n2 < n3 || n2 < n1) && (n2 > n3 || n2 > n1)) {
			meio = n2;
			
		} else if ( (n3 < n1 || n3 < n2) && (n3 > n1 || n3 > n2)) {
			meio = n3;
		}
		
		System.out.println(" A ordem crescente dos n�meros apresentados �: " + menor + ", " + meio + " " + maior + ". ");
		
	}
}