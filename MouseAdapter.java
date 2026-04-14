import javax.swing.*;
import java.awt.event.*;

public class Main{
    public static void main(String args[]){
        JFrame f=new JFrame("Mouse");

        f.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("X="+e.getX()+" Y="+e.getY());
            }
        });

        f.setSize(300,200);
        f.setVisible(true);
    }
}
