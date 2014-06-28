package com.toolkit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class valid extends JFrame  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	perform1 per1=new perform1();
    String num1="Alpha";
    String num2="Numeric";
    String num3="Alphanumeric";
    Container contentPane = getContentPane();
    JPanel jp=new JPanel(new GridLayout(2, 2));
    JLabel label1=new JLabel("STUDENT NAME", JLabel.LEFT);
    JLabel label2=new JLabel("REG NO", JLabel.LEFT);
    JTextField text1=new JTextField(15);
    JTextField text2=new JTextField(15);
    public valid(){
        text1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                per1.dis(text1, e, num1);

            }
        });
        text2.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                per1.dis(text2, e, num2);
            }
        });
        setLayout(new FlowLayout(FlowLayout.CENTER));
        jp.add(label1);
        jp.add(text1);
        jp.add(label2);
        jp.add(text2);
        contentPane.add("Center", jp);
        setSize(400, 300);
        setVisible(true);
    }
    public static void main(String ar[])
    {
        new valid();
    }
}
class perform1{
public void dis(JTextField PTxtCtrl,KeyEvent PKeyvalue,String PTempStr){
    JLabel error=new JLabel();
    //JTextField text=new JTextField();
    String TmpCurntStr;
    String TmpConvStr;
    value val = value.valueOf(PTempStr);

   switch(val){
       case Alpha:
           if((PKeyvalue.getKeyChar()>='a'&& PKeyvalue.getKeyChar()<='z')||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_DELETE)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_BACK_SPACE))
           {
           TmpCurntStr=PTxtCtrl.getText();
           //TmpConvStr=TmpCurntStr.toUpperCase();
           PTxtCtrl.setText(TmpCurntStr);
           //PTxtCtrl.setEditable(true);
           //error.setText("");
          }else{
           //PTxtCtrl.setEditable(false);
           //error.setText("* Enter only numeric digits(0-9)");

           }
           break;
       case Numeric:
           if((PKeyvalue.getKeyChar()>='0'&& PKeyvalue.getKeyChar()<='9')||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_DELETE)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_BACK_SPACE))
           {
           TmpCurntStr=PTxtCtrl.getText();
           System.out.println("hai");
           }else{
               JOptionPane.showMessageDialog(null,"Only numeric");
           }
           break;
       case Alphanumeric:
           break;
   }
 }
  enum value{
    Alpha,
    Numeric,
    Alphanumeric
}
}