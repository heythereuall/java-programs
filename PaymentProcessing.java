interface Payment{
    void pay(double amt);
}

class CreditCard implements Payment{
    public void pay(double amt){
        System.out.println("Paid "+amt+" using Credit Card");
    }
}

class UPI implements Payment{
    public void pay(double amt){
        System.out.println("Paid "+amt+" using UPI");
    }
}

public class Main{
    public static void main(String args[]){
        Payment p=new UPI();
        p.pay(500);
    }
}
