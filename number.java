import java.util.Scanner;
import java.util.Random;

class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); // instanitiation
        int num = rand.nextInt(100) + 1;
        int guess;
        int round;
        int attempt = 0, score = 100;
        System.out.println(" Welcome to number guessing game.");
        System.out.println(" Enter the number of rounds you want to play.Each round has 5 attempts");
        round = sc.nextInt();
        while (round > 0) {
            System.out.println("Guess for a number which Computer is thinking of between 1 and 100");
            while (attempt < 5) {
                System.out.println(" Enter the guess");
                guess = sc.nextInt();
                attempt++;
                if (guess == num) {
                    System.out.println("You guessed the correct number in " + attempt + " attempts.");
                    System.out.println("Your score is " + score);
                    System.exit(0);
                    break;
                } else if (guess < num) {
                    System.out.println("The guessed number s too low.Try again");
                } else {
                    System.out.println("The guessed number is too high.Try again");
                }
                score -= 20;
            }
            if (attempt == 5) {
                System.out.println("You were not able to Guess the correct number in 5 attempts. ");

                System.out.println("Score= " + score);
            }
            round--;
            System.out.println("Play again");
            System.out.println("You are left with " + round + " rounds");
            attempt = 0;
        }
        System.out.println("The number was " + num);
    }
}