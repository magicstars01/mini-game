import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        hello();

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int attempts = 0;
        int generator = random.nextInt(100)+1;
        System.out.println("Guess a number between 1 and 100");
        int guess = input.nextInt();

        while (guess != generator) {
            attempts++;
            if (guess > generator) {
                System.out.println("Your guess is HIGHER");
            } else {
                System.out.println("Your guess is LOWER");
            } System.out.println("Guess again!");
            guess = input.nextInt();
        } 

        attempts++;
        System.out.println("You win! It took " + attempts + " attempts.");

    }

    static void hello() {
        System.out.println("This is a number guessing game!");
    }
}