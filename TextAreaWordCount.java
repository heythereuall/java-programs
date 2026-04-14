import javax.swing.*;

public class Main{
    public static void main(String args[]){
        JFrame f=new JFrame("Word Count");

        JTextArea ta=new JTextArea();
        JScrollPane sp=new JScrollPane(ta);
        JButton b=new JButton("Count");

        sp.setBounds(50,50,200,100);
        b.setBounds(100,170,80,30);

        b.addActionListener(e->{
            String text=ta.getText();
            int words=text.trim().isEmpty()?0:text.split("\\s+").length;
            JOptionPane.showMessageDialog(f,"Words: "+words);
        });

        f.add(sp); f.add(b);
        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
