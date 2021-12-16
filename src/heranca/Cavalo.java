package heranca;

public class Cavalo extends Animal{
	public Cavalo (){
	}
	public Cavalo (String nome, int idade, String emitirSom, String movimentacao) {
		
	}
	@Override
		public String emitirSom() {
			
			return "Relinchar";
	}
	public static void main(String[] args) {
		
			Animal animal1 = new Cavalo ();
		
		System.out.println(animal1.emitirSom());
	
	}
}

