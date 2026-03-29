import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        FileInputStream in=new FileInputStream("a.txt");
        FileOutputStream out=new FileOutputStream("b.txt");

        int i;
        while((i=in.read())!=-1)
            out.write(i);

        System.out.println("File copied");
    }
}
