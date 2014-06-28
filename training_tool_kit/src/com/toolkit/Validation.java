package com.toolkit;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Validation extends JFrame {
        JTextField text;
        Container con;
        JLabel label;

        public Validation() {
                con = getContentPane();
                setBounds(0, 0, 500, 300);
                text = new JTextField(25);
                setLayout(new FlowLayout());
                con.add(new JLabel("Enter the number"));
                con.add(text);
                con.add(label = new JLabel());
                label.setForeground(Color.red);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                text.addKeyListener(new KeyAdapter() {
                        public void keyPressed(KeyEvent EVT) {
                                String value = text.getText();
                                int l = value.length();
                                if (EVT.getKeyChar() >= '0' && EVT.getKeyChar() <= '9') {
                                        text.setEditable(true);
                                        label.setText("");
                                } else {
                                        text.setEditable(false);
                                        label.setText("* Enter only numeric digits(0-9)");
                                        
                                }
                        }
                });
                show();
        }

        public static void main(String[] args) {
                new Validation();
        }
}