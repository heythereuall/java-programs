class BankAccount{
    int balance=1000;

    synchronized void deposit(int amt){
        balance+=amt;
        System.out.println("Deposited: "+amt+" Balance: "+balance);
    }

    synchronized void withdraw(int amt){
        if(balance>=amt){
            balance-=amt;
            System.out.println("Withdrawn: "+amt+" Balance: "+balance);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
}

class MyThread extends Thread{
    BankAccount b;
    MyThread(BankAccount b){ this.b=b; }

    public void run(){
        b.deposit(500);
        b.withdraw(700);
    }
}

public class Main{
    public static void main(String args[]){
        BankAccount b=new BankAccount();
        new MyThread(b).start();
        new MyThread(b).start();
    }
}
