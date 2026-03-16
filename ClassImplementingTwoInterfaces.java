interface I1{
    default void show(){
        System.out.println("Interface I1");
    }
}

interface I2{
    default void show(){
        System.out.println("Interface I2");
    }
}

class Test implements I1, I2{

    public void show(){
        I1.super.show();
        I2.super.show();
    }
}

public class Main{
    public static void main(String args[]){
        Test t = new Test();
        t.show();
    }
}
