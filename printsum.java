import java.util.Scanner;

public class printsum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         int totalSum = 0;
        while (true) {
            System.out.print("Enter a number (or 'x' to stop): ");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("x")) {
                break;
            }
            try {
                int number = Integer.parseInt(userInput);
                totalSum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("Total sum: " + totalSum);
    }
    }
    

