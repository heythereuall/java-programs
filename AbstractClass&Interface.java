abstract class Vehicle{
    abstract void start();
}

interface Electric{
    void charge();
}

class Tesla extends Vehicle implements Electric{
    void start(){
        System.out.println("Tesla started");
    }

    public void charge(){
        System.out.println("Charging battery");
    }
}

public class Main{
    public static void main(String args[]){
        Tesla t=new Tesla();
        t.start();
        t.charge();
    }
}
