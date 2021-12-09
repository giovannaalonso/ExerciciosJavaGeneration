/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

package exercicio.condicional.java;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nInsira a sua idade: ");
		idade = entrada.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Você está na categoria Infantil.");
			
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria Juvenil.");
			
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Você está na categoria Adulto.");
				
		} else  {
			System.out.println("Você não se encaixa em nenhuma categoria.");
		
	}
	
	}
}

