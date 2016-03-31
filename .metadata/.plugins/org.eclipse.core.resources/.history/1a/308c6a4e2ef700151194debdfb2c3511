/**
 * Created by Marcelo on 28/03/2016.
 */
public class AndGate extends LogicGate{

    private InputPin PinA;
    private InputPin PinB;

    @Override
    public boolean getOutputValue(int index) {

        boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
        boolean sinalB = pinB.getSource().getOutputValue(pinA.getIndex());

        return sinalA && sinalB;

    }
}