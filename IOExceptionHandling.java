import java.io.*;

public class Main{
    static void readFile(String f) throws IOException{
        FileReader fr=new FileReader(f);
        fr.close();
    }

    public static void main(String args[]){
        try{
            readFile("test.txt");
            System.out.println("File read");
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
}
