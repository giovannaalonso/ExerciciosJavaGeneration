package logica;

import java.util.Scanner;

public class exercicioTres {

	public static void main (String args[]) {
		
		Scanner entrada = new Scanner(System.in);
			
		int segundos, horas, minutos, calculoRestoSegundos, calculoHoras, calculoRestoMinutos, calculoSegundos;
		
		System.out.println("\nQuantos segundos durou o seu evento? ");
		 segundos = entrada.nextInt();
	
		calculoRestoSegundos = segundos % 3600;
		calculoHoras = (segundos - calculoRestoSegundos) / 60;
		calculoRestoMinutos = calculoRestoSegundos % 60;
		calculoSegundos = calculoRestoMinutos;

		System.out.println("\n Seu evento durou o equivalente " + calculoHoras + " horas " + calculoRestoMinutos + " minutos " +  calculoSegundos + " segundos.");
	}
}