package modelo;

public class HalfAdder extends LogicGate{

    private InputPin pinA;
    
    public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}
    
	private InputPin pinB;

	public void setPinB(InputPin pinB) {
		this.pinB = pinB;
	}


    @Override
    public boolean getOutputValue(int index) {

        boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
        boolean sinalB = pinB.getSource().getOutputValue(pinB.getIndex());
        
        if (index == 0){
        	return ((!sinalA && sinalB) || (!sinalB && sinalA));
        }
        else{
        	return (sinalA && sinalB);
        }
        
    }
}

