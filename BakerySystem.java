class BreadBaker{
    void bake(){
        System.out.println("Bread baked");
    }
}

class CustomerService{
    void serve(){
        System.out.println("Customer served");
    }
}

public class Main{
    public static void main(String args[]){
        new BreadBaker().bake();
        new CustomerService().serve();
    }
}
