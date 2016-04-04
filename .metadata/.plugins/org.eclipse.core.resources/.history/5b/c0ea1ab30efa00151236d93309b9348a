package modelo.tests_portas;

import org.junit.Assert;
import org.junit.Test;

import modelo.*;

public class TestHalfAdder {

	@Test
	public void test1HA1() {
		Switch s = new Switch();
		HalfAdder ha = new HalfAdder();
		
		InputPin A = ha.getInputPin(0);
		InputPin B = ha.getInputPin(1);
		
		s.set1();
		
		A.setSource(s);
		B.setSource(s);
		
		ha.setPinA(A);
		ha.setPinB(B);
		
		boolean Saida = ha.getOutputValue(0);
		boolean Saida2 = ha.getOutputValue(1);
		
		Assert.assertFalse(Saida);
		Assert.assertTrue(Saida2);	
	}
	@Test
	public void test1HA0() {
		Switch s = new Switch();
		Switch s2 = new Switch();
		HalfAdder ha = new HalfAdder();
		
		InputPin A = ha.getInputPin(0);
		InputPin B = ha.getInputPin(1);
		
		s.set1();
		s2.set0();
		
		A.setSource(s);
		B.setSource(s2);
		
		ha.setPinA(A);
		ha.setPinB(B);
		
		boolean Saida = ha.getOutputValue(0);
		boolean Saida2 = ha.getOutputValue(1);
		
		Assert.assertTrue(Saida);
		Assert.assertFalse(Saida2);	
	}
	@Test
	public void test0HA1() {
		Switch s = new Switch();
		Switch s2 = new Switch();
		HalfAdder ha = new HalfAdder();
		
		InputPin A = ha.getInputPin(0);
		InputPin B = ha.getInputPin(1);
		
		s.set0();
		s2.set1();
		
		A.setSource(s);
		B.setSource(s2);
		
		ha.setPinA(A);
		ha.setPinB(B);
		
		boolean Saida = ha.getOutputValue(0);
		boolean Saida2 = ha.getOutputValue(1);
		
		Assert.assertTrue(Saida);
		Assert.assertFalse(Saida2);	
	}
	@Test
	public void test0HA0() {
		Switch s = new Switch();
		HalfAdder ha = new HalfAdder();
		
		InputPin A = ha.getInputPin(0);
		InputPin B = ha.getInputPin(1);
		
		s.set0();
		
		A.setSource(s);
		B.setSource(s);
		
		ha.setPinA(A);
		ha.setPinB(B);
		
		boolean Saida = ha.getOutputValue(0);
		boolean Saida2 = ha.getOutputValue(1);
		
		Assert.assertFalse(Saida);
		Assert.assertFalse(Saida2);
	}
	

}