package com.toolkit;

import javax.swing.JPanel;



public class MyPanel extends JPanel {
	/**
	 * 
	 */
	MyTextArea t;
	private static final long serialVersionUID = 1L;
	public MyPanel(){
		t=new MyTextArea();
		add(t);
	}
	public static void main(String...asd){
		MyPanel p=new MyPanel();
		p.setVisible(true);
	}
}
