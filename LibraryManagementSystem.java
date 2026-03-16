class Library{
    void issue(){
        System.out.println("Book Issued");
    }
    void returnBook(){
        System.out.println("Book Returned");
    }
}

public class Main{
    public static void main(String args[]){
        Library l=new Library();
        l.issue();
        l.returnBook();
    }
}
