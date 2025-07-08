package vehicleRentalSystem;
import java.util.*;

// ●  Custom constructors for different vehicle types
// ●  protected for vehicle attributes to allow subclass access
// ●  Rentable with method calculateRent(int days)
// ●  Used in rent calculation (e.g., baseRate × days ± surcharges)

// ○  Rentable abstracts rental behavior
// ○  Car, Bike, Truck inherit from Vehicle
// ○  Rent calculation differs by vehicle type
// ○  All fields hidden behind getters/setters.


interface Rent{
    double calculateRent(int days);
}

public class vehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> li = new ArrayList<>();
        

        System.out.print("Enter your name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter your email: ");
        String customerEmail = sc.nextLine();

        Customer customer = new Customer(customerName, customerEmail);

        double totalRent = 0.0;
        boolean continueBooking = true;

        while (continueBooking) {
            System.out.println("\nSelect a vehicle to rent:");
            System.out.println("1. Bike");
            System.out.println("2. Car");
            System.out.println("3. Truck");
            System.out.print("Enter your choice (1-3): ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            vehicle selectedVehicle = null;

            switch (choice) {
                case 1:
                    System.out.println("\nEnter Bike details:");
                    selectedVehicle = new bike(
                        inputString(sc, "Model: "),
                        inputString(sc, "Brand: "),
                        inputInt(sc, "Year: ")
                    );
                    break;
                case 2:
                    System.out.println("\nEnter Car details:");
                    selectedVehicle = new car(
                        inputString(sc, "Model: "),
                        inputString(sc, "Brand: "),
                        inputInt(sc, "Year: ")
                    );
                    break;
                case 3:
                    System.out.println("\nEnter Truck details:");
                    selectedVehicle = new truck(
                        inputString(sc, "Model: "),
                        inputString(sc, "Brand: "),
                        inputInt(sc, "Year: ")
                    );
                    break;
                default:
                    System.out.println("Invalid choice. Skipping booking.");
                    continue;
            }

            int days = inputInt(sc, "Enter number of days to rent: ");

            double rent = selectedVehicle.calculateRent(days);
            totalRent += rent;
            li.add(customer.getName() + " rented a " + selectedVehicle.getModel() + " for " + days + " days. Rent: Rs" + rent);
            System.out.println(customer.getName() + " rented a " + selectedVehicle.getModel() + " for " + days + " days. Rent: Rs" + rent);

            System.out.print("\nDo you want to book another vehicle? (yes/no): ");
            String response = sc.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                continueBooking = false;
            }
            
        }

        System.out.println("\nTotal rent amount: Rs" + totalRent);
        System.out.println("Thank you for using the Vehicle Rental System!");
        System.out.println("total history in our booking system is :  ");
        for(String l:li){
                System.out.println(l);
        }
    }

    private static String inputString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String val = sc.nextLine();
        return val;
    }

    private static int inputInt(Scanner sc, String prompt) {
        System.out.print(prompt);
        int val = sc.nextInt();
        sc.nextLine(); 
        return val;
    }
}