package logica;

import java.util.Scanner;

public class exercicioDois {

	public static void main (String args[]) {
				
		Scanner entrada = new Scanner(System.in);
			
		int dias, calculoRestoDias, calculoAno, calculoRestoMeses, calculoDias, calculoMes;
		
		System.out.println("\nQuantos dias de idade voc� tem? ");
		 dias = entrada.nextInt();
		
		
		 	calculoRestoDias = dias % 365;
			calculoAno = (dias - calculoRestoDias) /365;
			calculoRestoMeses = calculoRestoDias % 30;
			 calculoDias = calculoRestoMeses;
			 calculoMes = (calculoRestoDias - calculoRestoMeses) / 30;

				 System.out.println("\n Sua idade � o equivalente a " + calculoAno + " anos, " + calculoRestoMeses + " meses " +  calculoDias + " dias.");
			} 
		 	
	}
