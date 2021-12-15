package Heranca;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String emitirSom, String movimentacao) {
		super(nome, idade, emitirSom, movimentacao);
			}

	public static void main(String[] args) {
		
			Animal animal3 = new Preguica ("Guilherme", 3, "Desconhecido", "subir em árvore");
						
				System.out.println(animal3.emitindoSons());
	}

}
