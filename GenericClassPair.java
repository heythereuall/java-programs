class Pair<T,U>{
    T first;
    U second;

    Pair(T f,U s){
        first=f;
        second=s;
    }

    void show(){
        System.out.println(first+" "+second);
    }
}

public class Main{
    public static void main(String args[]){
        Pair<Integer,String> p=new Pair<>(1,"Aditi");
        p.show();
    }
}
