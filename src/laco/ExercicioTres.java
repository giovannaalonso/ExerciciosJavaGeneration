/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE) */

package laco;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int idade, menores=0, maiores=0;
		
		System.out.println("\nInsira a sua idade: ");
				idade = entrada.nextInt();
				
		while (idade != -99) {
			System.out.println("\nInsira a sua idade: ");
			idade = entrada.nextInt();
			
			if(idade < 21) {
				menores++;
				
			}else if(idade > 50){
				maiores++;
			}
		}
		System.out.println("\nIdade inválida. Programa finalizado!");
		System.out.println("\nO total de pessoas menores de 21 anos é de: " + menores);
		System.out.println("\nO total de pessoas maiores de 50 anos é de: " + maiores);
	}

}
