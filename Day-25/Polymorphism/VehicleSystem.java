package Polymorphism ;


class Vehicle {
    public void startEngine() {
        System.out.println("Starting a generic vehicle engine.");
    }
}


class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the car engine.");
    }
}


class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle engine.");
    }
}


class Truck extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the truck engine.");
    }
}


public class VehicleSystem {
    public static void main(String[] args) {
        Vehicle vehicle;

        vehicle = new Car();
        vehicle.startEngine();

        vehicle = new Motorcycle();
        vehicle.startEngine();

        vehicle = new Truck();
        vehicle.startEngine();
    }
}
