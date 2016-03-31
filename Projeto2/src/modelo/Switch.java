package modelo;

public class Switch implements Source {
	
	boolean sinal;
	
	public void set1(){
		sinal = true;
	}
	
	public void set0(){
		sinal = false;
	}
	
	public boolean getOutputValue(int index) {
		return sinal;
	}
}

