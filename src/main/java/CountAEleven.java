import java.util.Scanner;

class CountToEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number less than 11: ");
        int number = scanner.nextInt();

        for (int i = number; i <= 11; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
