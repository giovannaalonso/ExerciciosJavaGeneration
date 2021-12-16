package heranca;

public class Cachorro extends Animal {
	public Cachorro () {
	}

	public Cachorro(String nome, int idade, String emitirSom, String movimentacao) {
		
	}
	
	@Override
	public String emitirSom() {
		
		return "Latir";
	}
	public static void main(String[] args) {

			
			Animal animal2 = new Cachorro ();
				
				System.out.println(animal2.emitirSom());

			}

	
}