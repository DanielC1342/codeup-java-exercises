import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        game();
    }
    public static void game() {
        System.out.println("Im thinking of a number between 1 and 100...");
        int num = (int)(Math.random()*(100))+1;
        guess(num);
    }
    public static void guess(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess: ");
        int guess = sc.nextInt();
        if (guess > num) {
            System.out.println("GO LOWER");
            guess(num);
        }else if (guess < num) {
            System.out.println("GO HIGHER");
            guess(num);
        }else {
            System.out.println("GOOD GUESS!");
            System.out.println("Play again? [y/n]");
            String playagain = sc.next();
            if (playagain.equals("y")) {
                game();
            }
        }
    }
}
