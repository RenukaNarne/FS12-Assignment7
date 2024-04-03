import java.util.Scanner;

public class LibraryFineCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of days late
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();

        // Calculate fine based on the number of days late
        double fine = 0;
        if (daysLate <= 7) {
            fine = 0.5 * daysLate;
        } else if (daysLate <= 14) {
            fine = 0.5 * 7 + (daysLate - 7);
        } else if (daysLate <= 21) {
            fine = 0.5 * 7 + 1 * (daysLate - 7);
        } else {
            System.out.println("Membership canceled. You returned the book after 21 days.");
            System.exit(0); // Exit the program if membership is canceled
        }

        // Output fine information
        if (fine > 0) {
            System.out.println("Fine amount: Rs. " + fine);
        } else {
            System.out.println("No fine.");
        }

        scanner.close();
    }
}
