import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        FileWriter fw=new FileWriter("file.txt",true);
        fw.write("Hello\n");
        fw.close();

        System.out.println("Data appended");
    }
}
