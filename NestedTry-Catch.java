public class Main{
    public static void main(String args[]){
        try{
            try{
                int a=10/0;
            }
            catch(ArithmeticException e){
                System.out.println("Divide by zero");
            }

            int arr[]=new int[2];
            arr[5]=10;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array error");
        }
    }
}
