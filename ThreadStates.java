class MyThread extends Thread{
    public void run(){
        try{
            Thread.sleep(1000);
        }catch(Exception e){}
    }
}

public class Main{
    public static void main(String args[]) throws Exception{
        MyThread t=new MyThread();

        System.out.println("State: "+t.getState());
        t.start();

        System.out.println("State after start: "+t.getState());
        t.join();

        System.out.println("State after finish: "+t.getState());
    }
}
