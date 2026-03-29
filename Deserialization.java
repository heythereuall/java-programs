import java.io.*;

class Student implements Serializable{
    int id;
    String name;
}

public class Main{
    public static void main(String args[]) throws Exception{
        ObjectInputStream i=new ObjectInputStream(new FileInputStream("s.txt"));
        Student s=(Student)i.readObject();

        System.out.println(s.id+" "+s.name);
    }
}
