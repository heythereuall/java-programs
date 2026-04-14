import javax.swing.*;

public class Main{
    public static void main(String args[]){
        JFrame f=new JFrame("Menu");

        JMenuBar mb=new JMenuBar();
        JMenu file=new JMenu("File");
        JMenuItem exit=new JMenuItem("Exit");

        exit.addActionListener(e->{
            int r=JOptionPane.showConfirmDialog(f,"Exit?");
            if(r==0) System.exit(0);
        });

        file.add(exit);
        mb.add(file);

        f.setJMenuBar(mb);
        f.setSize(300,200);
        f.setVisible(true);
    }
}
