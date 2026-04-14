import javax.swing.*;
import java.awt.event.*;

public class Main{
    public static void main(String args[]){
        JFrame f=new JFrame("Button");

        JButton b=new JButton("Submit");
        JLabel l=new JLabel();

        b.setBounds(100,50,100,30);
        l.setBounds(100,100,200,30);

        b.addActionListener(e -> l.setText("Button Clicked"));

        f.add(b); f.add(l);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
