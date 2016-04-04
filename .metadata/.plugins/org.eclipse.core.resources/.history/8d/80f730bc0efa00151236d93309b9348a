package modelo.tests_portas;

import org.junit.Assert;
import org.junit.Test;

import modelo.*;

public class TestNotGate {

	@Test
	public void test1Not() {
		Switch s = new Switch();
		NotGate not = new NotGate();
		
		InputPin A = not.getInputPin(0);
		
		s.set1();
		
		A.setSource(s);
		
		not.setPinA(A);
		
		boolean Saida = not.getOutputValue(0);
		
		Assert.assertFalse(Saida);
		
	}
	
	@Test
	public void test0Not() {
		Switch s = new Switch();
		NotGate not = new NotGate();
		
		InputPin A = not.getInputPin(0);
		
		s.set0();
		
		A.setSource(s);
		
		not.setPinA(A);
		
		boolean Saida = not.getOutputValue(0);
		
		Assert.assertTrue(Saida);
		
	}
}