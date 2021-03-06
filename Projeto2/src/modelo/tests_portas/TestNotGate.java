package modelo.tests_portas;

import org.junit.Assert;
import org.junit.Test;

import modelo.*;

public class TestNotGate {
	Switch s = new Switch();
	NotGate not = new NotGate();
	
	InputPin A = not.getInputPin(0);

	@Test
	public void test1Not() {
		s.setSinal(true);
		
		A.setSource(s);
		
		not.setPinA(A);
		
		boolean Saida = not.getOutputValue(0);
		
		Assert.assertFalse(Saida);
		
	}
	
	@Test
	public void test0Not() {
		s.setSinal(false);
		
		A.setSource(s);
		
		not.setPinA(A);
		
		boolean Saida = not.getOutputValue(0);
		
		Assert.assertTrue(Saida);
		
	}
}