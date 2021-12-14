package POO;

public class ExecutandoClienteExercicioUm {

	public static void main(String[] args) {
		
		ClienteExercicoUm cliente1 = new ClienteExercicoUm ("Camila", 39, "Rua teste", 939317888, true);
		
		ClienteExercicoUm cliente2= new ClienteExercicoUm("Giovanna", 24, "Rua teste", 998202884, false);
		
		System.out.println(cliente1.somandoStrings());
		System.out.println(cliente2.somandoStrings());
	}

}
