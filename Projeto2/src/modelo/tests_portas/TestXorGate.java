package modelo.tests_portas;

import org.junit.Assert;
import org.junit.Test;

import modelo.XorGate;
import modelo.InputPin;
import modelo.Switch;

public class TestXorGate  {

	@Test
	public void test1Xor1() {
		Switch s = new Switch();
		XorGate xor = new XorGate();
		
		InputPin A = xor.getInputPin(0);
		InputPin B = xor.getInputPin(1);
		
		s.setSinal(true);
		
		A.setSource(s);
		B.setSource(s);
		
		xor.setPinA(A);
		xor.setPinB(B);
		
		boolean Saida = xor.getOutputValue(0);
		
		Assert.assertFalse(Saida);
		
	}
	@Test
	public void test0Xor1(){
		Switch s = new Switch();
		Switch s2 = new Switch();
		XorGate xor = new XorGate();
		
		InputPin A = xor.getInputPin(0);
		InputPin B = xor.getInputPin(1);
		
		s.setSinal(false);
		A.setSource(s);
		
		s2.setSinal(true);
		B.setSource(s2);
		
		xor.setPinA(A);
		xor.setPinB(B);
		
		boolean Saida = xor.getOutputValue(0);
		
		Assert.assertTrue(Saida);
			
	}
	@Test
	public void test1Xor0(){
		Switch s = new Switch();
		Switch s2 = new Switch();
		XorGate xor = new XorGate();
		
		InputPin A = xor.getInputPin(0);
		InputPin B = xor.getInputPin(1);
		
		s.setSinal(true);
		A.setSource(s);
		
		s2.setSinal(false);
		B.setSource(s2);
		
		xor.setPinA(A);
		xor.setPinB(B);
		
		boolean Saida = xor.getOutputValue(0);
		
		Assert.assertTrue(Saida);
			
	}
	@Test
	public void test0Xor0(){
		Switch s = new Switch();
		XorGate xor = new XorGate();
		
		InputPin A = xor.getInputPin(0);
		InputPin B = xor.getInputPin(1);
		
		s.setSinal(false);
		A.setSource(s);
		B.setSource(s);
		
		xor.setPinA(A);
		xor.setPinB(B);
		
		boolean Saida = xor.getOutputValue(0);
		
		Assert.assertFalse(Saida);
			
	}
	

}
