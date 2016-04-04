package modelo.tests_portas;

import org.junit.Assert;
import org.junit.Test;

import modelo.*;

public class TestFullAdder {

	@Test
	public void test1FA1C1() {
		Switch s = new Switch();
		FullAdder fa = new FullAdder();
		
		InputPin A = fa.getInputPin(0);
		InputPin B = fa.getInputPin(1);
		InputPin C = fa.getInputPin(2);
		
		s.set1();
		
		A.setSource(s);
		B.setSource(s);
		C.setSource(s);
		
		fa.setPinA(A);
		fa.setPinB(B);
		fa.setCarry(C);
		
		
		boolean Saida = fa.getOutputValue(0);
		boolean Saida2 = fa.getOutputValue(1);
		
		Assert.assertTrue(Saida);
		Assert.assertTrue(Saida2);	
	}
	@Test
	public void test1FA1C0() {
		Switch s = new Switch();
		Switch s2 = new Switch();
		FullAdder fa = new FullAdder();
		
		InputPin A = fa.getInputPin(0);
		InputPin B = fa.getInputPin(1);
		InputPin C = fa.getInputPin(2);
		
		s.set1();
		s2.set0();
		
		A.setSource(s);
		B.setSource(s);
		C.setSource(s2);
		
		fa.setPinA(A);
		fa.setPinB(B);
		fa.setCarry(C);
		
		
		boolean Saida = fa.getOutputValue(0);
		boolean Saida2 = fa.getOutputValue(1);
		
		Assert.assertFalse(Saida);
		Assert.assertTrue(Saida2);	
	}
	@Test
	public void test1FA0C1() {
		Switch s = new Switch();
		Switch s2 = new Switch();
		FullAdder fa = new FullAdder();
		
		InputPin A = fa.getInputPin(0);
		InputPin B = fa.getInputPin(1);
		InputPin C = fa.getInputPin(2);
		
		s.set1();
		s2.set0();
		
		A.setSource(s);
		B.setSource(s2);
		C.setSource(s);
		
		fa.setPinA(A);
		fa.setPinB(B);
		fa.setCarry(C);
		
		
		boolean Saida = fa.getOutputValue(0);
		boolean Saida2 = fa.getOutputValue(1);
		
		Assert.assertFalse(Saida);
		Assert.assertTrue(Saida2);	
	}
	@Test
	public void test1FA0C0() {
		Switch s = new Switch();
		Switch s2 = new Switch();
		FullAdder fa = new FullAdder();
		
		InputPin A = fa.getInputPin(0);
		InputPin B = fa.getInputPin(1);
		InputPin C = fa.getInputPin(2);
		
		s.set1();
		s2.set0();
		
		A.setSource(s);
		B.setSource(s2);
		C.setSource(s2);
		
		fa.setPinA(A);
		fa.setPinB(B);
		fa.setCarry(C);
		
		
		boolean Saida = fa.getOutputValue(0);
		boolean Saida2 = fa.getOutputValue(1);
		
		Assert.assertTrue(Saida);
		Assert.assertFalse(Saida2);	
	}
	@Test
	public void test0FA1C1() {
		Switch s = new Switch();
		Switch s2 = new Switch();
		FullAdder fa = new FullAdder();
		
		InputPin A = fa.getInputPin(0);
		InputPin B = fa.getInputPin(1);
		InputPin C = fa.getInputPin(2);
		
		s.set1();
		s2.set0();
		
		A.setSource(s2);
		B.setSource(s);
		C.setSource(s);
		
		fa.setPinA(A);
		fa.setPinB(B);
		fa.setCarry(C);
		
		
		boolean Saida = fa.getOutputValue(0);
		boolean Saida2 = fa.getOutputValue(1);
		
		Assert.assertFalse(Saida);
		Assert.assertTrue(Saida2);	
	}
	@Test
	public void test0FA1C0() {
		Switch s = new Switch();
		Switch s2 = new Switch();
		FullAdder fa = new FullAdder();
		
		InputPin A = fa.getInputPin(0);
		InputPin B = fa.getInputPin(1);
		InputPin C = fa.getInputPin(2);
		
		s.set1();
		s2.set0();
		
		A.setSource(s2);
		B.setSource(s);
		C.setSource(s2);
		
		fa.setPinA(A);
		fa.setPinB(B);
		fa.setCarry(C);
		
		
		boolean Saida = fa.getOutputValue(0);
		boolean Saida2 = fa.getOutputValue(1);
		
		Assert.assertTrue(Saida);
		Assert.assertFalse(Saida2);	
	}
	public void test0FA0C1() {
		Switch s = new Switch();
		Switch s2 = new Switch();
		FullAdder fa = new FullAdder();
		
		InputPin A = fa.getInputPin(0);
		InputPin B = fa.getInputPin(1);
		InputPin C = fa.getInputPin(2);
		
		s.set1();
		s2.set0();
		
		A.setSource(s2);
		B.setSource(s2);
		C.setSource(s);
		
		fa.setPinA(A);
		fa.setPinB(B);
		fa.setCarry(C);
		
		
		boolean Saida = fa.getOutputValue(0);
		boolean Saida2 = fa.getOutputValue(1);
		
		Assert.assertTrue(Saida);
		Assert.assertFalse(Saida2);	
	}
	@Test
	public void test0FA0C0() {
		Switch s = new Switch();
		FullAdder fa = new FullAdder();
		
		InputPin A = fa.getInputPin(0);
		InputPin B = fa.getInputPin(1);
		InputPin C = fa.getInputPin(2);
		
		s.set0();
		
		A.setSource(s);
		B.setSource(s);
		C.setSource(s);
		
		fa.setPinA(A);
		fa.setPinB(B);
		fa.setCarry(C);
		
		
		boolean Saida = fa.getOutputValue(0);
		boolean Saida2 = fa.getOutputValue(1);
		
		Assert.assertFalse(Saida);
		Assert.assertFalse(Saida2);	
	}
	
	

}