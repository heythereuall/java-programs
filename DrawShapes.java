import javax.swing.*;
import java.awt.*;

public class Main extends JPanel{

    public void paint(Graphics g){
        g.drawRect(50,50,100,50);
        g.drawOval(50,120,100,50);
        g.drawLine(50,200,150,200);
    }

    public static void main(String args[]){
        JFrame f=new JFrame("Shapes");
        Main m=new Main();

        f.add(m);
        f.setSize(300,300);
        f.setVisible(true);
    }
}
