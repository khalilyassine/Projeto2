package modelo.tests_portas;

import org.junit.Assert;
import org.junit.Test;

import modelo.*;

public class TestAndGate {

	@Test
	public void test1And1() {
		Switch s = new Switch();
		AndGate and = new AndGate();
		
		InputPin A = and.getInputPin(0);
		InputPin B = and.getInputPin(1);
		
		s.setSinal(true);
		
		A.setSource(s);
		B.setSource(s);
		
		and.setPinA(A);
		and.setPinB(B);
		
		boolean Saida = and.getOutputValue(0);
		
		Assert.assertTrue(Saida);
		
	}
	@Test
	public void test0And1(){
		Switch s = new Switch();
		Switch s2 = new Switch();
		AndGate and = new AndGate();
		
		InputPin A = and.getInputPin(0);
		InputPin B = and.getInputPin(1);
		
		s.setSinal(false);
		A.setSource(s);
		
		s2.setSinal(true);
		B.setSource(s2);
		
		and.setPinA(A);
		and.setPinB(B);
		
		boolean Saida = and.getOutputValue(0);
		
		Assert.assertFalse(Saida);
			
	}
	@Test
	public void test1And0(){
		Switch s = new Switch();
		Switch s2 = new Switch();
		AndGate and = new AndGate();
		
		InputPin A = and.getInputPin(0);
		InputPin B = and.getInputPin(1);
		
		s.setSinal(true);
		A.setSource(s);
		
		s2.setSinal(false);
		B.setSource(s2);
		
		and.setPinA(A);
		and.setPinB(B);
		
		boolean Saida = and.getOutputValue(0);
		
		Assert.assertFalse(Saida);
			
	}
	@Test
	public void test0And0(){
		Switch s = new Switch();
		AndGate and = new AndGate();
		
		InputPin A = and.getInputPin(0);
		InputPin B = and.getInputPin(1);
		
		s.setSinal(false);
		A.setSource(s);
		B.setSource(s);
		
		and.setPinA(A);
		and.setPinB(B);
		
		boolean Saida = and.getOutputValue(0);
		
		Assert.assertFalse(Saida);
			
	}
	

}
