import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RentalSystem rentalSystem = new RentalSystem();

        // Adding sample vehicles
        rentalSystem.addVehicle("V001", "Car", 50.0);
        rentalSystem.addVehicle("V002", "Bike", 20.0);
        rentalSystem.addVehicle("V003", "Truck", 80.0);

        while (true) {
            System.out.println("\nVehicle Rental System");
            System.out.println("1. Display All Vehicles");
            System.out.println("2. Register User");
            System.out.println("3. Login User");
            System.out.println("4. Rent Vehicle");
            System.out.println("5. Return Vehicle");
            System.out.println("6. Display Rental History");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    rentalSystem.displayVehicles();
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    rentalSystem.registerUser(username, password);
                    break;
                case 3:
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    rentalSystem.loginUser(username, password);
                    break;
                case 4:
                    System.out.print("Enter Vehicle ID to rent: ");
                    String rentID = scanner.nextLine();
                    System.out.print("Enter rental duration (in days): ");
                    int duration = scanner.nextInt();
                    rentalSystem.rentVehicle(rentID, duration);
                    break;
                case 5:
                    System.out.print("Enter Vehicle ID to return: ");
                    String returnID = scanner.nextLine();
                    rentalSystem.returnVehicle(returnID);
                    break;
                case 6:
                    rentalSystem.displayRentalHistory();
                    break;
                case 7:
                    System.out.println("Thank you for using the Vehicle Rental System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
