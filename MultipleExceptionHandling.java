import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};

        try{
            System.out.print("Enter index: ");
            int i=sc.nextInt();

            System.out.print("Enter number: ");
            int n=sc.nextInt();

            System.out.println("Value: "+arr[i]);
            System.out.println("Division: "+(10/n));
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }
    }
}
