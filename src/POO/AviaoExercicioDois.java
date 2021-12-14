package POO;

public class AviaoExercicioDois {
	
	//ATRIBUTOS
	
	private String categoriaPoltrona;
	private int numeroPoltrona;
	private Character corredorPoltrona;
	private boolean poltronaOcupada;
	
	
	public AviaoExercicioDois(String categoriaPoltrona, int numeroPoltrona, Character corredorPoltrona, boolean poltronaOcupada) {
		
		this.categoriaPoltrona =  categoriaPoltrona;
		this.numeroPoltrona = numeroPoltrona;
		this.corredorPoltrona = corredorPoltrona;
		this.poltronaOcupada = poltronaOcupada;
	}

	//MÉTODOS
	
	public String somandoStrings () {
		
		String somandoStrings = categoriaPoltrona + ", "+  numeroPoltrona + ", " + corredorPoltrona  + ", "  + poltronaOcupada + ".";
		
		return somandoStrings;
		
	}
}
