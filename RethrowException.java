class Test{
    static void m() throws Exception{
        throw new Exception("Error in method");
    }
}

public class Main{
    public static void main(String args[]){
        try{
            Test.m();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
