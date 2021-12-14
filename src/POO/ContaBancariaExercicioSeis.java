package POO;

public class ContaBancariaExercicioSeis {

	private double saldo;
	private double saque;
	private double acrescimo;
	private String status;
	
public ContaBancariaExercicioSeis(double saldo, double saque, double acrescimo, String status) {
		
		this.setSaldo (saldo);
		this.setSaque  (saque);
		this.setAcrescimo  (acrescimo);
		this.setStatus (status);
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public double getSaque() {
	return saque;
}

public void setSaque(double saque) {
	this.saque = saque;
}

public double getAcrescimo() {
	return acrescimo;
}

public void setAcrescimo(double acrescimo) {
	this.acrescimo = acrescimo;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String somandoStrings () {
	
	String somandoStrings = saldo+ ", "+  saque + ", " + acrescimo  + ", "  + status + ".";
	
	return somandoStrings;
	
}
}