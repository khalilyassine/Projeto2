package controle;

import modelo.*;
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
		
		if (x.getCheck() == 1){
			OrGate or = new OrGate();
	    	
			boolean sinal1 = x.getCheckbox1().isSelected();
			boolean sinal2 = x.getCheckbox2().isSelected();
						
			s.setSinal(sinal1);
			s2.setSinal(sinal2);
			
			A.setSource(s);
			B.setSource(s2);
			
			or.setPinA(A);
			or.setPinB(B);
			
			boolean saida = or.getOutputValue(0);

			x.getCheckbox4().setSelected(saida);
		}
		
		if (x.getCheck() == 2){
			NotGate not = new NotGate();
	    	
			boolean sinal1 = x.getCheckbox1().isSelected();
						
			s.setSinal(sinal1);
			
			A.setSource(s);
			
			not.setPinA(A);
			
			boolean saida = not.getOutputValue(0);

			x.getCheckbox4().setSelected(saida);
		}
		
		if (x.getCheck() == 3){
			XorGate xor = new XorGate();
	    	
			boolean sinal1 = x.getCheckbox1().isSelected();
			boolean sinal2 = x.getCheckbox2().isSelected();
						
			s.setSinal(sinal1);
			s2.setSinal(sinal2);
			
			A.setSource(s);
			B.setSource(s2);
			
			xor.setPinA(A);
			xor.setPinB(B);
			
			boolean saida = xor.getOutputValue(0);

			x.getCheckbox4().setSelected(saida);
		}
		
		if (x.getCheck() == 4){
			HalfAdder ha = new HalfAdder();
	    	
			boolean sinal1 = x.getCheckbox1().isSelected();
			boolean sinal2 = x.getCheckbox2().isSelected();
						
			s.setSinal(sinal1);
			s2.setSinal(sinal2);
			
			A.setSource(s);
			B.setSource(s2);
			
			ha.setPinA(A);
			ha.setPinB(B);
			
			boolean saida = ha.getOutputValue(0);
			boolean saida2 = ha.getOutputValue(1);

			x.getCheckbox4().setSelected(saida);
			x.getCheckbox5().setSelected(saida2);
		}
		
		if (x.getCheck() == 5){
			FullAdder fa = new FullAdder();
	    	
			boolean sinal1 = x.getCheckbox1().isSelected();
			boolean sinal2 = x.getCheckbox2().isSelected();
			boolean sinal3 = x.getCheckbox3().isSelected();
						
			s.setSinal(sinal1);
			s2.setSinal(sinal2);
			s3.setSinal(sinal3);
			
			A.setSource(s);
			B.setSource(s2);
			CarryIn.setSource(s3);
			
			fa.setPinA(A);
			fa.setPinB(B);
			fa.setCarry(CarryIn);
			
			boolean saida = fa.getOutputValue(0);
			boolean saida2 = fa.getOutputValue(1);

			x.getCheckbox4().setSelected(saida);
			x.getCheckbox5().setSelected(saida2);
		}
	}
}
