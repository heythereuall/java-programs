import java.io.*;

public class Main{
    public static void main(String args[]){

        try{
            FileInputStream in = new FileInputStream("source.txt");
            FileOutputStream out = new FileOutputStream("dest.txt");

            int data;
            while((data = in.read()) != -1){
                out.write(data);
            }

            in.close();
            out.close();

            System.out.println("File copied successfully");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
