package vetores.matrizes;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int dado, total = 0, maiorPontuacao = 0, i = 0;
		int[] vetor = new int[10];
		float media;
						
			for(dado = 0; dado <10; dado++){
				System.out.println("\nInsira um numero: ");
				vetor[dado] = entrada.nextInt();

				total = total + vetor[dado];

					if(vetor[dado] > maiorPontuacao){
						maiorPontuacao = vetor[dado];
						
					}
			}
			for(dado = 0; dado < 10; dado++){	
					
				if (vetor[dado] == maiorPontuacao){

					i++;

					}
						}

				media = total /10.0f;
				System.out.println("\nA média é: " + media);
			
			System.out.println("\nTivemos " + i + " ocorrências da maior pontuação");
	}

}
