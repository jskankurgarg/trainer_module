package com.toolkit;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AddTextJPanel atjp;
	JButton jb;
	
	TestFrame(){
		setLayout(new GridLayout(0,1,5,5));
		
		JButton add=new JButton();
		add(add);
		
		atjp.validate();
		setSize(500, 600);
		setVisible(true);
	}
	public static void main(String...asd){
		TestFrame tf=new TestFrame();
	}
}
