interface A{
    default void show(){
        System.out.println("A method");
    }
}

interface B{
    default void show(){
        System.out.println("B method");
    }
}

class Test implements A,B{
    public void show(){
        A.super.show();
    }
}

public class Main{
    public static void main(String args[]){
        new Test().show();
    }
}
