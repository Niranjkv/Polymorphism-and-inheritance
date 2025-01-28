import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class RentalSystem {
    private List<Vehicle> vehicles;
    private List<User> users;
    private User loggedInUser;

    public RentalSystem() {
        vehicles = new ArrayList<>();
        users = new ArrayList<>();
        loggedInUser = null;  // No user logged in initially
    }

    // Method to add a vehicle
    public void addVehicle(String vehicleID, String vehicleType, double pricePerDay) {
        Vehicle newVehicle = new Vehicle(vehicleID, vehicleType, pricePerDay);
        vehicles.add(newVehicle);
        System.out.println("Vehicle added: " + newVehicle);
    }

    // Method to register a new user
    public void registerUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username already exists.");
                return;
            }
        }
        User newUser = new User(username, password);
        users.add(newUser);
        System.out.println("User registered: " + newUser);
    }

    // Method to login
    public boolean loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                loggedInUser = user;
                System.out.println("Login successful.");
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }

    // Method to rent a vehicle
    public void rentVehicle(String vehicleID, int rentalDuration) {
        if (loggedInUser == null) {
            System.out.println("Please log in first.");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleID().equals(vehicleID)) {
                if (vehicle.isAvailable()) {
                    vehicle.setAvailable(false);
                    vehicle.setRentalDuration(rentalDuration);
                    loggedInUser.addRental(vehicleID, rentalDuration);
                    System.out.println("Vehicle rented: " + vehicle);
                    System.out.println("Total cost: " + vehicle.getPricePerDay() * rentalDuration);
                    return;
                } else {
                    System.out.println("Vehicle is not available for rent.");
                    return;
                }
            }
        }
        System.out.println("Vehicle ID not found.");
    }

    // Method to return a vehicle
    public void returnVehicle(String vehicleID) {
        if (loggedInUser == null) {
            System.out.println("Please log in first.");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getVehicleID().equals(vehicleID)) {
                if (!vehicle.isAvailable()) {
                    vehicle.setAvailable(true);
                    loggedInUser.getRentalHistory().remove(vehicleID);
                    System.out.println("Vehicle returned: " + vehicle);
                    return;
                } else {
                    System.out.println("Vehicle was not rented.");
                    return;
                }
            }
        }
        System.out.println("Vehicle ID not found.");
    }

    // Method to display all vehicles
    public void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
        } else {
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }

    // Method to display user rental history
    public void displayRentalHistory() {
        if (loggedInUser == null) {
            System.out.println("Please log in first.");
            return;
        }

        System.out.println("Rental History for " + loggedInUser.getUsername() + ":");
        for (Entry<String, Integer> entry : loggedInUser.getRentalHistory().entrySet()) {
            System.out.println("Vehicle ID: " + entry.getKey() + ", Rental Duration: " + entry.getValue() + " days");
        }
    }
}
