package modelo;

public class FullAdder extends LogicGate{

    private InputPin pinA;
	private InputPin pinB;
	private InputPin carry;
    
    public void setCarry(InputPin carry) {
		this.carry = carry;
	}

	public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}
    
	public void setPinB(InputPin pinB) {
		this.pinB = pinB;
	}
	


    @Override
    public boolean getOutputValue(int index) {

        boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
        boolean sinalB = pinB.getSource().getOutputValue(pinB.getIndex());
        boolean sinalCarry = carry.getSource().getOutputValue(pinB.getIndex());
        
    	boolean xor1 = ((!sinalA && sinalB) || (!sinalB && sinalA));
        
        if (index == 0){
        	return ((!xor1 && sinalCarry) || (!sinalCarry && xor1));
        }
        else{
        	return (xor1 && sinalCarry) || (sinalA && sinalB);
        }
        
    }
}

