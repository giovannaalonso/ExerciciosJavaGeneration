package POO;

public class ClienteExercicoUm {

	// ATRIBUTOS
	
	private String nome;
	private int idade;
	private String endereco; 
	private int celular;
	private boolean comunicacaoPorWhatsApp;
	

	public ClienteExercicoUm (String nome, int idade, String endereco, int celular, boolean comunicacaoPorWhatsApp) {
		
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.celular = celular;
		this.comunicacaoPorWhatsApp = comunicacaoPorWhatsApp;
		
	}
	
	//MÉTODOS
	
	public String somandoStrings () {
	
		 String somandoStrings = nome + ", "+  idade + ", " + endereco  + ", " + celular + ", " + comunicacaoPorWhatsApp + ".";
		
		return somandoStrings;
		
	}

	
}
