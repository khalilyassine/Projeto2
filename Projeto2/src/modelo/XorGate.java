package modelo;

public class XorGate extends LogicGate{

    private InputPin pinA;
    
    public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}

	public void setPinB(InputPin pinB) {
		this.pinB = pinB;
	}

	private InputPin pinB;

    @Override
    public boolean getOutputValue(int index) {

        boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
        boolean sinalB = pinB.getSource().getOutputValue(pinA.getIndex());

        return (!sinalA && sinalB) || (!sinalB && sinalA);

    }
}

