import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter text: ");
        String s=br.readLine();

        FileWriter fw=new FileWriter("data.txt");
        fw.write(s);
        fw.close();

        System.out.println("Saved");
    }
}
