/**
 * Created by Marcelo on 28/03/2016.
 */
package modelo;

public class OrGate extends LogicGate{

    private InputPin pinA;
    private InputPin pinB;

    @Override
    public boolean getOutputValue(int index) {

        boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
        boolean sinalB = pinB.getSource().getOutputValue(pinA.getIndex());

        return sinalA || sinalB;

    }
}
