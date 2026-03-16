class ATM {
    double balance = 5000;

    void withdraw(double amount) throws Exception{
        if(amount > balance){
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void checkBalance(){
        System.out.println("Balance: " + balance);
    }
}

public class Main{
    public static void main(String args[]){
        ATM a = new ATM();

        try{
            a.deposit(1000);
            a.withdraw(2000);
            a.withdraw(7000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        a.checkBalance();
    }
}
