import java.util.Scanner;

public class BonusCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input current year and year of joining
        System.out.print("Enter current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter the year of joining: ");
        int yearOfJoining = scanner.nextInt();

        // Calculate years of service
        int yearsOfService = currentYear - yearOfJoining;

        // Calculate bonus based on years of service
        int bonusAmount = 0;
        if (yearsOfService > 5) {
            bonusAmount = 5000;
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            bonusAmount = 3000;
        }

        // Output bonus information
        if (bonusAmount > 0) {
            System.out.println("Bonus awarded: Rs. " + bonusAmount);
        } else {
            System.out.println("No bonus awarded.");
        }

        scanner.close();
    }
}
