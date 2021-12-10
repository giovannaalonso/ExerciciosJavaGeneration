package logica;

import java.util.Scanner;

public class exercicioUm {

	public static void main (String args[]) {
		
				
		Scanner entrada = new Scanner(System.in);
		int idade, ano, mes, dias, calcularIdade;
		
		System.out.println("\nQuantos anos você tem? ");
		 idade = entrada.nextInt();
		 System.out.println("\nQuantos meses, além dos anos completos, você tem?");
		 mes = entrada.nextInt();
		 System.out.println("\nQuantos dias, além dos anos e meses completos, você tem de idade?");
		 dias = entrada.nextInt();
		 
		calcularIdade = (idade * 365) + (mes * 30) + dias;
		
		 System.out.println("\n Sua idade é o equivalente a " + calcularIdade + " dias");
	}
	
}
