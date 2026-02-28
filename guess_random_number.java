package sub_strings;
import java.util.Random;
import java.util.Scanner;

public class guess_random_number {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;

        for (; ; ) {
            System.out.print("Enter your guess (1-10): ");
            guess = sc.nextInt();
            attempts++;
            if (guess < randomNumber) {
                System.out.println("Number is less");
            } else if (guess > randomNumber) {
                System.out.println("Number is greater");
            } else {
                System.out.println("Perfect guess");
                System.out.println("Your total attempt is " + attempts);
                break;
            }
        }
        sc.close();
    }
}

