class MyThread extends Thread{
    MyThread(ThreadGroup tg,String name){
        super(tg,name);
    }

    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class Main{
    public static void main(String args[]){
        ThreadGroup tg=new ThreadGroup("CompanyWorkers");

        new MyThread(tg,"T1").start();
        new MyThread(tg,"T2").start();
        new MyThread(tg,"T3").start();

        System.out.println("Group: "+tg.getName());
        System.out.println("Active threads: "+tg.activeCount());
    }
}
