package vetores.matrizes;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int [] vetor = new int [5]; 
		int valores, maiorPontuacao =0;

			for(valores = 0; valores < 5; valores ++){
		
		System.out.println("\nDigite a nota que você tirou na Atividade: ");
		
		vetor[valores] = entrada.nextInt();

				if( vetor[valores] >= maiorPontuacao){

					maiorPontuacao = vetor[valores];
					
				}
						}

			System.out.println( "\nA maior pontuação obtida é de: " +  maiorPontuacao);
	}
}