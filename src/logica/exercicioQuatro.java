package logica;

import java.util.Scanner;

public class exercicioQuatro {

	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);
			
		int a,b,c,d,r,s;
		
		System.out.println("\nDigite o primeiro número positivo e inteiro: ");
		a = entrada.nextInt();
		System.out.println("\nDigite o segundo número positivo e inteiro: ");
		b = entrada.nextInt();
		System.out.println("\nDigite o terceiro número positivo e inteiro ");
		c = entrada.nextInt();
	
	
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r + s) /2;
	
		System.out.println("\nO resultado final é: " + d);
	}
}
