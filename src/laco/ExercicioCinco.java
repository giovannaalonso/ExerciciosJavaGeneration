/* Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/

package laco;

import java.util.Scanner;

public class ExercicioCinco {

	public static void main(String[] args) {
		
				Scanner entrada = new Scanner(System.in);

			int numero, multiplos = 0, soma = 0, media = 0;
			
			do {
				
				System.out.println("\nInsira um número inteiro: ");
				numero = entrada.nextInt();
				
				if (numero % 3 == 0 && numero != 0) {
				
					soma++;
					
					multiplos = multiplos + numero;
				
				}
											
			} while (numero != 0); 
			
			media = multiplos/soma;
			
			System.out.println("A média dos números informados e multiplos de 3 é: " + media);
			
	}
}
