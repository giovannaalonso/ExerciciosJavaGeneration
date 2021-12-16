package heranca;

public class Preguica extends Animal {
	
	public Preguica() {
		
	}

	public Preguica(String nome, int idade, String emitirSom, String movimentacao) {
		
			}
	
	@Override
	public String emitirSom() {
		
		return "Sons de preguiça";
	}

	public static void main(String[] args) {
		
			Animal animal3 = new Preguica ("Guilherme", 3, "Desconhecido", "subir em árvore");
						
				System.out.println(animal3.emitirSom());
	}

}
