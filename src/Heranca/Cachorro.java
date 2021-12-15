package Heranca;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String emitirSom, String movimentacao) {
		super(nome, idade, emitirSom, movimentacao);

	}

	public static void main(String[] args) {

			
			Animal animal2 = new Cachorro ("Barney", 7, "Latir", "correr");
				
				System.out.println(animal2.emitindoSons());

			}

	}
