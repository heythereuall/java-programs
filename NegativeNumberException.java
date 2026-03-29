import java.util.*;

class NegativeNumberException extends Exception{
    NegativeNumberException(String msg){
        super(msg);
    }
}

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        try{
            if(n<0)
                throw new NegativeNumberException("Negative number");
            else
                System.out.println("Square: "+(n*n));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
