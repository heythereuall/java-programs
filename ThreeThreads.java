class MyThread implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" : "+i);
            try{ Thread.sleep(500); }catch(Exception e){}
        }
    }
}

public class Main{
    public static void main(String args[]){
        Thread t1=new Thread(new MyThread(),"T1");
        Thread t2=new Thread(new MyThread(),"T2");
        Thread t3=new Thread(new MyThread(),"T3");

        t1.start();
        t2.start();
        t3.start();
    }
}
