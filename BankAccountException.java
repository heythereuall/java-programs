class InsufficientFundsException extends Exception{
    InsufficientFundsException(String msg){
        super(msg);
    }
}

class BankAccount{
    double balance=3000;

    void withdraw(double amt) throws InsufficientFundsException{
        if(amt>balance)
            throw new InsufficientFundsException("Insufficient Funds");
        else{
            balance-=amt;
            System.out.println("Withdrawn: "+amt);
        }
    }
}

public class Main{
    public static void main(String args[]){
        BankAccount b=new BankAccount();

        try{
            b.withdraw(2000);
            b.withdraw(2000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
