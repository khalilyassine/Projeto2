/**
 * Created by Marcelo on 28/03/2016.
 */
public class NotGate extends LogicGate{

    private InputPin PinA;

    @Override
    public boolean getOutputValue(int index) {

        boolean sinalA = pinA.getSource().getOutputValue(pinA.getIndex());
        return !sinalA;
        
    }
}
