package vetores.matrizes;

import java.util.Scanner;

public class ExercicioQuatro {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		int valorLinha, valorColuna, soma =0, somaDiagonal = 0;
		int [][] matriz = new int  [3][3];
	

	for(valorLinha = 0; valorLinha <3; valorLinha++){

		
		for(valorColuna = 0; valorColuna < 3; valorColuna++){

				System.out.println("\nDigite um valor para preencher a matriz: ");
				(matriz[valorLinha][valorColuna]) = entrada.nextInt();

				soma = soma + matriz[valorLinha][valorColuna];

					if(valorLinha == valorColuna){

					somaDiagonal = somaDiagonal+ matriz[valorLinha][valorColuna];
					}
}
		
	}
		System.out.println("\nA soma dos valores informados é: " + soma);
		System.out.println("\nA soma da diagonal principal é: " + somaDiagonal);
}

}
