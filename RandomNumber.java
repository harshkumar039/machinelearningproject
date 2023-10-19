import java.util.Scanner;

public class RandomNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a random number between 0 and 10: ");
        int userInput = scanner.nextInt();

        // Check if the input is within the range 0 to 10
        if (userInput >= 0 && userInput <= 10) {
            System.out.println("You entered: " + userInput);
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 10.");
        }

        scanner.close();
    }
}
In this code, the Scanner class is used to take input from the user. The program checks if the input number is between 0 and 10 (inclusive). If the input is within the specified range, it prints the number. If the input is outside the range, it displays an error message.





