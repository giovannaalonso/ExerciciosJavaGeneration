package Heranca;

public class Animal {
	
	private String nome;
	private int idade;
	private String emitirSom;
	private String movimentacao;
	public String getNome() {
		return nome;

	}
	
	public Animal (String nome, int idade, String emitirSom, String movimentacao) {
		
		this.setNome (nome);
		this.setIdade (idade);
		this.setEmitirSom (emitirSom);
		this.setMovimentacao (movimentacao);
		
	}
		
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String emitindoSons () {
		
				
		return getEmitirSom ();
	
	}
}