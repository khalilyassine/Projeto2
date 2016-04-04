package modelo;

public class Switch implements Source {
	
	boolean sinal;
	
	public void setSinal(boolean sinal) {
		this.sinal = sinal;
	}
	
	public boolean getOutputValue(int index) {
		return sinal;
	}
}

