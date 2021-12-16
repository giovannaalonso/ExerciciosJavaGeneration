package collection;

import java.util.ArrayList;

public class ExecutandoEstoque  {

	public static void main(String[] args) {

			Estoque e1 =  new Estoque("sabonete", 5, true);
			Estoque e2 =  new Estoque("xampu", 2, false);
			Estoque e3 =  new Estoque ("condicionador", 7, true);
			
			ArrayList<Estoque> implementacao =  new ArrayList <> ();
			
			implementacao.add(e1);
			
			System.out.println(implementacao.toString());
			
			implementacao.add(e2);
			
			System.out.println(implementacao.toString());
			
			implementacao.add(e3);
			
			System.out.println(implementacao.toString());
			
			implementacao.add(0,e3);
			System.out.println(implementacao.toString());
			
			implementacao.remove(1);
			System.out.println(implementacao.toString());
	}

}
