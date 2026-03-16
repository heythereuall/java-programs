package com.infosys.bank;

public class Account{
    protected double balance = 1000;
}


package com.infosys.bank;

public class SavingsAccount extends Account{
    public void showBalance(){
        System.out.println("Balance: " + balance);
    }
}


import com.infosys.bank.SavingsAccount;

public class Main{
    public static void main(String args[]){
        SavingsAccount s = new SavingsAccount();
        s.showBalance();
    }
}
