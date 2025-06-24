import java.util.Scanner;

public class MovieTicketSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalBill = 0;
        System.out.print("Enter movie type (Action, Comedy, Horror): ");
        String movieType = sc.nextLine();

        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Select ticket type (Gold, Silver, Platinum): ");
        String ticketType = sc.nextLine();

        int ticketPrice = 0;
        switch (ticketType.toLowerCase()) {
            case "gold":
                ticketPrice = 15;
                break;
            case "silver":
                ticketPrice = 10;
                break;
            case "platinum":
                ticketPrice = 20;
                break;
            default:
                System.out.println("Invalid ticket type. Defaulting to Silver.");
                ticketPrice = 10;
                ticketType = "Silver";
                break;
        }
        totalBill += ticketPrice;

        System.out.println("Ticket for '" + movieName + "' (" + movieType + ") - " + ticketType + " selected. Price: $" + ticketPrice);

        boolean moreItems = true;
        while (moreItems) {
            System.out.print("Do you want to buy snacks? (yes/no): ");
            String buySnacks = sc.nextLine();

            if (buySnacks.equalsIgnoreCase("yes")) {
                boolean moreSnacks = true;
                while (moreSnacks) {
                    System.out.print("Enter snack name (Popcorn, Burger, Coldrink): ");
                    String snackName = sc.nextLine();
                    int snackPrice = 0;

                    switch (snackName.toLowerCase()) {
                        case "popcorn":
                            snackPrice = 5;
                            break;
                        case "burger":
                            snackPrice = 7;
                            break;
                        case "coldrink":
                            snackPrice = 3;
                            break;
                        default:
                            System.out.println("Invalid snack name. No snack added.");
                            continue;
                    }

                    totalBill += snackPrice;
                    System.out.println(snackName + " added. Price: $" + snackPrice);

                    System.out.print("Do you want some more snacks? (yes/no): ");
                    String more = sc.nextLine();
                    if (!more.equalsIgnoreCase("yes")) {
                        moreSnacks = false;
                    }
                }
            }

            System.out.print("Do you want some more items? (yes/no): ");
            String more = sc.nextLine();
            if (!more.equalsIgnoreCase("yes")) {
                moreItems = false;
            }
        }

        System.out.println("Movie: " + movieName + " (" + movieType + ")");
        System.out.println("Ticket Type: " + ticketType + " - $" + ticketPrice);
        System.out.println("Total Bill: $" + totalBill);
        System.out.println("Thank you for your purchase!");
    }
}
