package logica;

import java.util.Scanner;

public class exercicioUm {

	public static void main (String args[]) {
		
				
		Scanner entrada = new Scanner(System.in);
		int idade, ano, mes, dias, calcularIdade;
		
		System.out.println("\nQuantos anos voc� tem? ");
		 idade = entrada.nextInt();
		 System.out.println("\nQuantos meses, al�m dos anos completos, voc� tem?");
		 mes = entrada.nextInt();
		 System.out.println("\nQuantos dias, al�m dos anos e meses completos, voc� tem de idade?");
		 dias = entrada.nextInt();
		 
		calcularIdade = (idade * 365) + (mes * 30) + dias;
		
		 System.out.println("\n Sua idade � o equivalente a " + calcularIdade + " dias");
	}
	
}
