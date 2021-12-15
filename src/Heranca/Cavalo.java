package Heranca;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade, String emitirSom, String movimentacao) {
		super(nome, idade, emitirSom, movimentacao);

	}

	public static void main(String[] args) {
		
			Animal animal1 = new Cavalo ("Alfredo", 2, "Relinchar", "correr");
		
		System.out.println(animal1.emitindoSons());

	}

}
