package modelo.tests_portas;

import org.junit.Assert;
import org.junit.Test;

import modelo.*;

public class TestOrGate {

	@Test
	public void test1Or1() {
		Switch s = new Switch();
		OrGate or = new OrGate();
		
		InputPin A = or.getInputPin(0);
		InputPin B = or.getInputPin(1);
		
		s.set1();
		
		A.setSource(s);
		B.setSource(s);
		
		or.setPinA(A);
		or.setPinB(B);
		
		boolean Saida = or.getOutputValue(0);
		
		Assert.assertTrue(Saida);
		
	}
	@Test
	public void test0And1(){
		Switch s = new Switch();
		Switch s2 = new Switch();
		OrGate or = new OrGate();
		
		InputPin A = or.getInputPin(0);
		InputPin B = or.getInputPin(1);
		
		s.set1();
		A.setSource(s);
		
		s2.set0();
		B.setSource(s2);
		
		or.setPinA(A);
		or.setPinB(B);
		
		boolean Saida = or.getOutputValue(0);
		
		Assert.assertTrue(Saida);
			
	}
	@Test
	public void test1And0(){
		Switch s = new Switch();
		Switch s2 = new Switch();
		OrGate or = new OrGate();
		
		InputPin A = or.getInputPin(0);
		InputPin B = or.getInputPin(1);
		
		s.set1();
		A.setSource(s);
		
		s2.set0();
		B.setSource(s2);
		
		or.setPinA(A);
		or.setPinB(B);
		
		boolean Saida = or.getOutputValue(0);
		
		Assert.assertTrue(Saida);
			
	}
	@Test
	public void test0And0(){
		Switch s = new Switch();
		OrGate or = new OrGate();
		
		InputPin A = or.getInputPin(0);
		InputPin B = or.getInputPin(1);
		
		s.set0();
		
		A.setSource(s);
		B.setSource(s);
		
		or.setPinA(A);
		or.setPinB(B);
		
		boolean Saida = or.getOutputValue(0);
		
		Assert.assertFalse(Saida);
			
	}
	

}