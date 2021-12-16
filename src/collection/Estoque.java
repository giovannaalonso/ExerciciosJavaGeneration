package collection;

public class Estoque {

	//ATRIBUTOS
	
	private String produtos;
	private int quantidadeProdutos;
	private boolean valido;

	
	// MÉTODOS
	
	public String  imprimirDados () {
				
	return produtos + " "+ quantidadeProdutos + " "+ valido + " .";
	}

	@Override
	public String toString() {
		return  produtos + ", " + quantidadeProdutos +  ", " + valido;
	}

	public Estoque(String produtos, int quantidadeProdutos, boolean valido) {
		this.produtos = produtos;
		this.quantidadeProdutos = quantidadeProdutos;
		this.valido = valido;
	}

	public String getProdutos() {
		return produtos;
	}

	public void setProdutos(String produtos) {
		this.produtos = produtos;
	}

	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}

	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}
}
