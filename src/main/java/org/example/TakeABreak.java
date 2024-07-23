import java.util.Scanner;

class TakeABreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String response;

        do {
            System.out.print("Do you want to take a break? ");
            response = scanner.nextLine();
        } while (!response.equals("yes"));

        System.out.println("Taking a break!");
        scanner.close();
    }
}

