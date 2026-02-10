import java.util.*;
class Student {
    int rollno;
    String name;
    int marks;
}
class Demo {
    public static void main(String[] args) {
        Student s = new Student();

        s.rollno = 111;
        s.name = "Aditi";
        s.marks = 95;

        System.out.println("Roll No: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.println("Marks: " + s.marks);
    }
}
