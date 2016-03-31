/**
 * Created by Marcelo on 28/03/2016.
 */
package modelo;

public class LogicGate implements Source, Drain{

    public boolean getOutputValue(int index){

        return false;
    }

    public InputPin getInputPin(int index){

        InputPin pin = new InputPin(index);
        return pin;
    }

}
