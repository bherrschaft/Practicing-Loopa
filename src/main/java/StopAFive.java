import java.util.Scanner;

class StopAtFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
        } while (number != 5);

        System.out.println("You entered 5, stopping the program.");
        scanner.close();
    }
}
