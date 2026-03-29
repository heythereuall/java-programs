import java.io.*;

class Student implements Serializable{
    int id=1;
    String name="Aditi";
}

public class Main{
    public static void main(String args[]) throws Exception{
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("s.txt"));
        o.writeObject(new Student());
        System.out.println("Serialized");
    }
}
