import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String args[]){
        JFrame f=new JFrame("Layout");

        f.setLayout(new BorderLayout());
        f.add(new JButton("North"),BorderLayout.NORTH);
        f.add(new JButton("South"),BorderLayout.SOUTH);

        JPanel p=new JPanel(new GridLayout(2,2));
        p.add(new JButton("1"));
        p.add(new JButton("2"));
        p.add(new JButton("3"));
        p.add(new JButton("4"));

        f.add(p,BorderLayout.CENTER);

        f.setSize(300,300);
        f.setVisible(true);
    }
}
