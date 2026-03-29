import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        FileWriter fw=new FileWriter("stud.txt");
        fw.write("1 Aditi 90");
        fw.close();

        BufferedReader br=new BufferedReader(new FileReader("stud.txt"));
        System.out.println(br.readLine());
    }
}
