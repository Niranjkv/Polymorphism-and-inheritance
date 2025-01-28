public class Vehicle {
    private String vehicleID;
    private String vehicleType;
    private boolean isAvailable;
    private double pricePerDay;  // Added price per day for rental
    private int rentalDuration;  // Added rental duration in days

    // Constructor
    public Vehicle(String vehicleID, String vehicleType, double pricePerDay) {
        this.vehicleID = vehicleID;
        this.vehicleType = vehicleType;
        this.isAvailable = true;
        this.pricePerDay = pricePerDay;
        this.rentalDuration = 0;
    }

    // Getters and Setters
    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleID + ", Type: " + vehicleType + ", Available: " + isAvailable + ", Price per Day: " + pricePerDay;
    }
}
