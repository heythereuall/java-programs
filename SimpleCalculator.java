import javax.swing.*;

public class Main{
    public static void main(String args[]){
        JFrame f=new JFrame("Calculator");

        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField res=new JTextField();

        JButton add=new JButton("+");

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        add.setBounds(170,75,50,30);
        res.setBounds(50,150,100,30);

        add.addActionListener(e->{
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            res.setText(""+(a+b));
        });

        f.add(t1); f.add(t2); f.add(add); f.add(res);
        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
