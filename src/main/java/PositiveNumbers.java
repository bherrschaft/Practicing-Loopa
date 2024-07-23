import java.util.Scanner;

class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a positive number (or 0 to stop): ");
            number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Your number must be positive.");
            } else if (number > 0) {
                System.out.println("You entered: " + number);
            }
        } while (number != 0);

        System.out.println("Program ended.");
        scanner.close();
    }
}
