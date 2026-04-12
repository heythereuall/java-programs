class MyThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Daemon running...");
            try{ Thread.sleep(500); }catch(Exception e){}
        }
    }
}

public class Main{
    public static void main(String args[]){
        MyThread t=new MyThread();
        t.setDaemon(true);
        t.start();

        System.out.println("Main thread ends");
    }
}
