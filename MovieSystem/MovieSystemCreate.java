import java.util.*;

public class MovieSystemCreate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grandTotal = 0;

        while (true) {
            int moviePrice = 0;
            int popcornPrice = 0;
            int total = 0;

            System.out.println("Here is the list of movies:");
            System.out.println("1. Keshari 2");
            System.out.println("2. Raid 2");
            System.out.println("3. Jolly LLB 2");
            System.out.println("4. Dhoom 2");
            System.out.println("5. Judwa 2");
            System.out.print("Enter your movie choice (1-5): ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Price for Keshari 2 is 500");
                    moviePrice = 500;
                    break;
                case 2:
                    System.out.println("Price for Raid 2 is 400");
                    moviePrice = 400;
                    break;
                case 3:
                    System.out.println("Price for Jolly LLB 2 is 600");
                    moviePrice = 600;
                    break;
                case 4:
                    System.out.println("Price for Dhoom 2 is 300");
                    moviePrice = 300;
                    break;
                case 5:
                    System.out.println("Price for Judwa 2 is 600");
                    moviePrice = 600;
                    break;
                default:
                    System.out.println("Enter valid Choice Numbers from 1 to 5.");
                    continue;
            }

            scanner.nextLine();
            System.out.print("Do you want to add popcorns? (Yes/No): ");
            String popchoice = scanner.nextLine();

            if (popchoice.equals("Yes")) {
                System.out.println("1. Normal Popcorn - ₹1000");
                System.out.println("2. Cheese Popcorn - ₹1500");
                System.out.println("3. Spicy Popcorn - ₹1100");
                System.out.print("Enter your popcorn choice (1-3): ");
                int choicepopp = scanner.nextInt();

                switch (choicepopp) {
                    case 1:
                        System.out.println("Price for Normal Popcorn is 1000");
                        popcornPrice = 1000;
                        break;
                    case 2:
                        System.out.println("Price for Cheese Popcorn is 1500");
                        popcornPrice = 1500;
                        break;
                    case 3:
                        System.out.println("Price for Spicy Popcorn is 1100");
                        popcornPrice = 1100;
                        break;
                    default:
                        System.out.println("Enter a valid popcorn choice.");
                        continue;
                }
                total = moviePrice + popcornPrice;
                System.out.println("Total Price to Pay: ₹" + total);
            } else if (popchoice.equals("No")) {
                total = moviePrice;
                System.out.println("Total Price to Pay (Only Movie Ticket): ₹" + total);
            } else {
                System.out.println("Invalid input. Please enter Yes or No.");
                continue;
            }

            grandTotal += total;

            scanner.nextLine();
            System.out.print("Do you want to book more? (Yes/No): ");
            String moreBooking = scanner.nextLine();

            if (moreBooking.equals("No")) {
                System.out.println("Final Total Price for All Bookings: ₹" + grandTotal);
                System.out.println("Thank you for booking!");
                break;
            } else if (!moreBooking.equals("Yes")) {
                System.out.println("Invalid input. Exiting.");
                break;
            }
        }

        
    }
}
