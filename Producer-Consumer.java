class Buffer{
    int data;
    boolean flag=false;

    synchronized void produce(int val){
        try{
            if(flag) wait();
            data=val;
            System.out.println("Produced: "+data);
            flag=true;
            notify();
        }catch(Exception e){}
    }

    synchronized void consume(){
        try{
            if(!flag) wait();
            System.out.println("Consumed: "+data);
            flag=false;
            notify();
        }catch(Exception e){}
    }
}

class Producer extends Thread{
    Buffer b;
    Producer(Buffer b){ this.b=b; }

    public void run(){
        for(int i=1;i<=5;i++) b.produce(i);
    }
}

class Consumer extends Thread{
    Buffer b;
    Consumer(Buffer b){ this.b=b; }

    public void run(){
        for(int i=1;i<=5;i++) b.consume();
    }
}

public class Main{
    public static void main(String args[]){
        Buffer b=new Buffer();
        new Producer(b).start();
        new Consumer(b).start();
    }
}
