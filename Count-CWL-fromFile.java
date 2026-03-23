import java.io.*;

public class Main{
    public static void main(String args[]) throws Exception{

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);

        int chars = 0, words = 0, lines = 0;
        String line;

        while((line = br.readLine()) != null){
            lines++;
            chars += line.length();
            words += line.split(" ").length;
        }

        br.close();

        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
    }
}
