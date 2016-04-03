package visao;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class MainFrame extends JFrame implements ActionListener{
    public JButton button_and;
    public JButton button_or;
    public JButton button_not;
    public JButton button_xor;
    public JButton button_ha;
    public JButton button_fa;
    
    public int check = 6;

    public void paint(Graphics g){
	    super.paint( g );
        if(check==0){
    	    ///	AND
    	    g.drawLine(0, 45,50,45);
    	    g.drawLine(0, 20,50,20);
    	    g.drawLine(80, 35,120,35);
    	    g.drawLine(50, 60, 50, 10);
    	    g.drawArc(30, 10, 50, 50, -100,200 );
        }
        if(check==1){
    		g.drawLine(25, 70, 75, 70);
    		g.drawLine(25, 100, 75, 100);
    		g.drawArc(-20, 35, 97, 100, 310, 100);
    		g.drawLine(59, 47, 119, 47);
    		g.drawLine(59, 124, 119, 124);
    		g.drawArc(40, 35, 97, 100, 310, 100);
    		g.drawLine(138, 85, 185, 85);
        }
        if(check==2){
    	    g.drawLine(90, 100, 120, 130);
    	    g.drawLine(120, 130,90,160);
    	    g.drawLine(90, 100, 90, 160);
    	    g.drawLine(40, 130,90,130);
    	    g.drawLine(120, 130,150,130);
    	    g.drawArc(120, 125, 10, 10, 0, 360);
        }
    }

    public void start(){
        setLayout(null);
        /*Button AND*/
        button_and = new JButton();
        button_and.setText("Port AND"); 
        button_and.setBounds(280 , 0, 120, 20);
        button_and.addActionListener(this);
        add(button_and);
        
        /*Button OR*/
        button_or = new JButton();
        button_or.setText("Port OR"); 
        button_or.setBounds(280 , 20, 120, 20);
        button_or.addActionListener(this);
        add(button_or);
        
        /*Button NOT*/
        button_not = new JButton();
        button_not.setText("Port NOT"); 
        button_not.setBounds(280 , 40, 120, 20);
        button_not.addActionListener(this);
        add(button_not);
        
        /*Button XOR*/
        button_xor = new JButton();
        button_xor.setText("Port XOR"); 
        button_xor.setBounds(280 , 60, 120, 20);
        button_xor.addActionListener(this);
        add(button_xor);
        
        /*Button HalfAdder*/
        button_ha = new JButton();
        button_ha.setText("Half Adder"); 
        button_ha.setBounds(280 , 80, 120, 20);
        button_ha.addActionListener(this);
        add(button_ha);
        
        /*Button FullAdder*/
        button_fa = new JButton();
        button_fa.setText("Full Adder"); 
        button_fa.setBounds(280 , 100, 120, 20);
        button_fa.addActionListener(this);
        add(button_fa);
        
        setSize(400,400);
        setVisible(true);
    }    

    public void actionPerformed(ActionEvent e) {    
    	if(e.getSource() == button_and){
    		check=0;
    	}
    	if(e.getSource() == button_or){
    		check=1;
    	}
    	if(e.getSource() == button_not){
    		check=2;
    	}
    	if(e.getSource() == button_xor){
    		check=3;
    	}
    	if(e.getSource() == button_ha){
    		check=4;
    	}
    	if(e.getSource() == button_fa){
    		check=5;
    	}
    	
        repaint();
    }

    public static void main(String args[]){
        MainFrame x=new MainFrame();
        x.start();
    }
}