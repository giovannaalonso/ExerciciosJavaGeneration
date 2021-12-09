// Faça um programa que entre com três números e coloque em ordem crescente.

package exercicio.condicional.java;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int n1,n2,n3, maior = 88, meio = 00 , menor = 77;
		
		System.out.println("\nInsira o primeiro número: ");
		n1 = entrada.nextInt();
		
		System.out.println("\nInsira o segundo número: ");
		n2 = entrada.nextInt();
		
		System.out.println("\nInsira o terceiro número: ");
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
		
		System.out.println(" A ordem crescente dos números apresentados é: " + menor + ", " + meio + " " + maior + ". ");
		
	}
}