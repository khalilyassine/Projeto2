package visao;

import java.awt.GridLayout;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

public class MainFrame {

	public static void main(String[] s) {

		JFrame frame = new JFrame("JFrame Example");

		JPanel panel = new JPanel();
		
		panel.setLayout(null);
		
		/* Visual da Porta AND */
		JButton button_and = new JButton();
		
		button_and.setText("Porta AND");
		panel.add(button_and);
		button_and.setBounds(280 , 0,
	             120, 20);
		
		/*Visual da Porta OR*/
		JButton button_or = new JButton();
		
		button_or.setText("Porta OR");
		panel.add(button_or);
		button_or.setBounds(280 , 20,
	             120,20);
		
		/*Visual da Porta NOT*/
		JButton button_not = new JButton();
		
		button_not.setText("Porta NOT");
		panel.add(button_not);
		button_not.setBounds(280 , 40,
	             120,20);
		
		/*Visual da Porta XOR*/
		JButton button_xor = new JButton();
		
		button_xor.setText("Porta XOR");
		panel.add(button_xor);
		button_xor.setBounds(280 , 60,
	             120,20);
		
		/*Visual do Half Adder*/
		JButton button_ha = new JButton();
		
		button_ha.setText("Half Adder");
		panel.add(button_ha);
		button_ha.setBounds(280 , 80,
	             120,20);
		
		/*Visual do Full Adder*/
		JButton button_fa = new JButton();
		
		button_fa.setText("Full Adder");
		panel.add(button_fa);
		button_fa.setBounds(280 , 100,
	             120,20);
		
		panel.setSize(200,200);
		frame.add(panel);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
			

	}

}