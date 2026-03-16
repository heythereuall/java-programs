class Vehicle {
    String type;
    Vehicle(String type){
        this.type = type;
    }
}

class Car extends Vehicle{
    Car(){ super("Car"); }
}

class Bike extends Vehicle{
    Bike(){ super("Bike"); }
}

class Truck extends Vehicle{
    Truck(){ super("Truck"); }
}

class ParkingLot{
    void park(Vehicle v){
        System.out.println(v.type + " parked. Ticket Generated.");
    }

    void exit(Vehicle v){
        System.out.println(v.type + " exited. Spot Freed.");
    }
}

public class Main{
    public static void main(String args[]){
        ParkingLot p = new ParkingLot();

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        p.park(v1);
        p.park(v2);

        p.exit(v1);
    }
}
