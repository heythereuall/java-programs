class Employee{
    double salary=10000;
}

class FullTime extends Employee{
    void bonus(){
        System.out.println("Bonus: "+salary*0.2);
    }
}

class Intern extends Employee{
    void bonus(){
        System.out.println("Bonus: "+salary*0.05);
    }
}

public class Main{
    public static void main(String args[]){
        new FullTime().bonus();
        new Intern().bonus();
    }
}
