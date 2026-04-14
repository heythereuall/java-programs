import javax.swing.*;

public class Main{
    public static void main(String args[]){
        JFrame f=new JFrame("Login");

        JTextField user=new JTextField();
        JPasswordField pass=new JPasswordField();
        JButton login=new JButton("Login");

        user.setBounds(50,50,150,30);
        pass.setBounds(50,100,150,30);
        login.setBounds(80,150,80,30);

        login.addActionListener(e->{
            if(user.getText().equals("admin") &&
               new String(pass.getPassword()).equals("1234"))
                JOptionPane.showMessageDialog(f,"Login Successful");
            else
                JOptionPane.showMessageDialog(f,"Invalid");
        });

        f.add(user); f.add(pass); f.add(login);
        f.setSize(300,250);
        f.setLayout(null);
        f.setVisible(true);
    }
}
