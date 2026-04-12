class Test<T extends Number>{
    T a,b;

    Test(T a,T b){
        this.a=a;
        this.b=b;
    }

    double sum(){
        return a.doubleValue()+b.doubleValue();
    }
}

public class Main{
    public static void main(String args[]){
        Test<Integer> t=new Test<>(10,20);
        System.out.println("Sum: "+t.sum());
    }
}
