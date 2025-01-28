import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private String password;
    private Map<String, Integer> rentalHistory;  // Keeps track of rental history by vehicle ID

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.rentalHistory = new HashMap<>();
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Map<String, Integer> getRentalHistory() {
        return rentalHistory;
    }

    // Method to add a rental to the history
    public void addRental(String vehicleID, int rentalDuration) {
        rentalHistory.put(vehicleID, rentalDuration);
    }

    @Override
    public String toString() {
        return "Username: " + username;
    }
}

