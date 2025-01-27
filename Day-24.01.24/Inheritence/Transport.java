package Inheritence;

class Transport {
    protected int capacity;
    protected String fuelType;

    public Transport(int capacity, String fuelType) {
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Capacity: " + capacity);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Bus extends Transport {
    private int numberOfDoors;

    public Bus(int capacity, String fuelType, int numberOfDoors) {
        super(capacity, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

class Car extends Transport {
    private boolean hasSunroof;

    public Car(int capacity, String fuelType, boolean hasSunroof) {
        super(capacity, fuelType);
        this.hasSunroof = hasSunroof;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sunroof: " + hasSunroof);
    }
}

class Bike extends Transport {
    private boolean hasHelmetStorage;

    public Bike(int capacity, String fuelType, boolean hasHelmetStorage) {
        super(capacity, fuelType);
        this.hasHelmetStorage = hasHelmetStorage;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Helmet Storage: " + hasHelmetStorage);
    }
}