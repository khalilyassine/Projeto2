/**
 * Created by Marcelo on 28/03/2016.
 */
package modelo;

public class InputPin{

    private int index;
    private Source source;

    public void setSource(Source source) {
		this.source = source;
	}

	public int getIndex() {

        return index;
    }

    public Source getSource() {

        return source;
    }

    public InputPin(int index) {

        this.index = index;
    }
}
