import java.util.Scanner;
import java.util.Random;

public class RandomNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 0 and 100
        int randomNumber = random.nextInt(101);

        System.out.print("Enter a number between 0 and 100: ");
        int userInput = scanner.nextInt();

        // Check if the input matches the random number
        if (userInput >= 0 && userInput <= 100) {
            if (userInput == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
            } else {
                System.out.println("Sorry, the correct number was: " + randomNumber);
            }
        } else {
            System.out.println("Invalid input. Please enter a number between 0 and 100.");
        }

        scanner.close();
    }
}
