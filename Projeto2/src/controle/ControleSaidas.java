package controle;

import modelo.AndGate;
import modelo.InputPin;
import modelo.LogicGate;
import modelo.Switch;
import visao.MainFrame;

public class ControleSaidas {
	Switch s = new Switch();
	Switch s2 = new Switch();
	Switch s3 = new Switch();
	LogicGate logic = new LogicGate();
	
	InputPin A = logic.getInputPin(0);
	InputPin B = logic.getInputPin(1);
	InputPin CarryIn = logic.getInputPin(2);
	
	public void controleSaidas(MainFrame x){
		if (x.getCheck() == 0){
			AndGate and = new AndGate();
    	
			boolean sinal1 = x.getCheckbox1().isSelected();
			boolean sinal2 = x.getCheckbox2().isSelected();
			
			
			s.setSinal(sinal1);
			s2.setSinal(sinal2);
			
			A.setSource(s);
			B.setSource(s2);
			
			and.setPinA(A);
			and.setPinB(B);
			
			boolean saida = and.getOutputValue(0);

			x.getCheckbox4().setSelected(saida);

    	}
	}
}
