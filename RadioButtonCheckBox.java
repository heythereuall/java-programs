import javax.swing.*;
import java.awt.event.*;

public class Main{
    public static void main(String args[]){
        JFrame f=new JFrame("Form");

        JRadioButton m=new JRadioButton("Male");
        JRadioButton f1=new JRadioButton("Female");

        ButtonGroup bg=new ButtonGroup();
        bg.add(m); bg.add(f1);

        JCheckBox c1=new JCheckBox("Music");
        JCheckBox c2=new JCheckBox("Sports");

        JButton b=new JButton("Submit");

        m.setBounds(50,50,100,30);
        f1.setBounds(150,50,100,30);
        c1.setBounds(50,100,100,30);
        c2.setBounds(150,100,100,30);
        b.setBounds(100,150,100,30);

        b.addActionListener(e->{
            String s="";
            if(m.isSelected()) s+="Male ";
            if(f1.isSelected()) s+="Female ";
            if(c1.isSelected()) s+="Music ";
            if(c2.isSelected()) s+="Sports ";

            JOptionPane.showMessageDialog(f,s);
        });

        f.add(m); f.add(f1); f.add(c1); f.add(c2); f.add(b);
        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
