/*// 3.	Escreve um programa que l� duas matrizes N1 (4,6) e N2(4,6) e cria:
//a) Uma matriz M1 cujos elementos ser�o as somas dos elementos de mesma posi��o das matrizes N1 e N2;
//b) Uma matriz M2 cujos elementos ser�o as diferen�as dos elementos de mesma posi��o das matrizes N1 e N2.


programa
{
	
	funcao inicio()
	{
	inteiro N1 [4][6], N2[4][6], M1[4][6], M2[4][6], linha, coluna, valor1, valor2

		para (linha = 0; linha < 4; linha ++){

								
			para (coluna = 0; coluna <6; coluna++){
				escreva ("\nDigite um n�mero da matriz 1: ")
				leia(valor1)

				N1[linha][coluna] = valor1

			}
		}

		para (linha = 0; linha < 4; linha ++){

								
			para (coluna = 0; coluna <6; coluna++){
				escreva ("\nDigite um n�mero da matriz 2: ")
				leia(valor2)

				N2[linha][coluna] = valor2

			}
		}

			para (linha = 0; linha < 4; linha ++){

				escreva("\n")
								
				para (coluna = 0; coluna <6; coluna++){

			M1 [linha][coluna] = N1[linha][coluna] + N2[linha][coluna]


				escreva("\t " +  M1 [linha][coluna])
			
				}
					}

					para (linha = 0; linha < 4; linha ++){

					escreva("\n")
								
				para (coluna = 0; coluna <6; coluna++){

			M2 [linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
				
				escreva("\t " +  M2 [linha][coluna])
		
	}
	
}
	}
} */

package vetores.matrizes;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int linha, coluna, valor1, valor2;

		int [][] N1 = new int [4][6];
		int [][] N2 = new int [4][6];
		int [][]M1 = new int [4][6];
		int [][] M2 = new int [4][6];
		
		
		for (linha = 0; linha < 4; linha ++)
		{

								
			for (coluna = 0; coluna <6; coluna++){
				System.out.print("\nDigite um n�mero da matriz 1: ");
				valor1 = entrada.nextInt();

				N1[linha][coluna] = valor1;

			}
		}

		for (linha = 0; linha < 4; linha ++){

			System.out.println("\t");
			for (coluna = 0; coluna <6; coluna++){
				System.out.print ("\nDigite um n�mero da matriz 2: ");
				valor2 = entrada.nextInt();

				N2[linha][coluna] = valor2;

			}
		}

			for (linha = 0; linha < 4; linha ++){

				System.out.println("\t");
								
				for(coluna = 0; coluna <6; coluna++){

			M1 [linha][coluna] = N1[linha][coluna] + N2[linha][coluna];


					System.out.print("\t " +  M1 [linha][coluna]);
			
				}
					}

					for (linha = 0; linha < 4; linha ++){

						System.out.println("\t");
								
				for (coluna = 0; coluna <6; coluna++){

			M2 [linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
				
			System.out.print("\t " +  M2 [linha][coluna]);
		
	}
					}
	}
}
