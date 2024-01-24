package currencyconverter;

import java.awt.*;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.*;
public class convert 
{
   public static void create()
   {
     JFrame frame =new JFrame();
     JLabel l1,l2;
     JTextField t1,t2;
     JButton b1,b2,b3;

     l1=new JLabel("Rupees");
     l1.setBounds(20, 40, 60, 30);
     l2=new JLabel("Dollars");
     l2.setBounds(200, 40, 60, 30);

     t1=new JTextField("0");
     t1.setBounds(80, 40, 60, 30);
     t2=new JTextField("0");
     t2.setBounds(260, 40, 60, 30);

    //initialising the button

    b1=new JButton("INR");
    b1.setBounds(80, 80, 60, 30);
    b2=new JButton();
    b2.setText("Dollar");
    b2.setBounds(260, 80, 60, 30);
    b3=new JButton("Close");
    b3.setBounds(150, 150, 60, 30);

    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            //converting into double
            double d=Double.parseDouble(t1.getText());
            double d1=(d/83.11);

            String str1= String.valueOf(d1);
            t2.setText(str1);
        }

       
        
    });
    b2.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
    {
            double d=Double.parseDouble(t2.getText());
            double d1=d*83.11;
            String s1=String.valueOf(d1);
            t1.setText(s1);

    }

       
    });

    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e)
        {
            frame.dispose();
        }

       

       
    });

     frame.setLayout(null);
     frame.setSize(400, 400);
     frame.add(l1);
     frame.add(l2);
     frame.add(t1);
     frame.add(t2);
     frame.add(b1);
     frame.add(b2);
     frame.add(b3);
     frame.setVisible(true);

   }
   public static void main(String[] args) {
    create();
   }

}