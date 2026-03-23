import java.io.*;

public class Main{
    public static void main(String args[]){

        try{
            FileInputStream f1 = new FileInputStream("file1.txt");
            FileInputStream f2 = new FileInputStream("file2.txt");
            FileOutputStream f3 = new FileOutputStream("file3.txt");

            int i;

            while((i = f1.read()) != -1)
                f3.write(i);

            while((i = f2.read()) != -1)
                f3.write(i);

            f1.close();
            f2.close();
            f3.close();

            System.out.println("Files merged successfully");
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
