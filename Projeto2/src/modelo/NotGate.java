/**
 * Created by Marcelo on 28/03/2016.
 */
package modelo;

public class NotGate extends LogicGate{

    private InputPin pinA;

    public void setPinA(InputPin pinA) {
		this.pinA = pinA;
	}

	@Override
    public boolean getOutputValue(int index) {

        boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
        return !sinalA;
        
    }
}
