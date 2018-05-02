import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        game();
    }
    public static void game() {
        System.out.println("Im thinking of a number between 1 and 100...");
        int num = (int)(Math.random()*(100))+1;
        guess(num,0);
    }
    public static void guess(int num, int guessnum) {
        Scanner sc = new Scanner(System.in);
        if (guessnum > 9) {
            System.out.println("GAME OVER!");
            System.out.println("Play again? [y/n]");
            String playagain = sc.next();
            if (playagain.equals("y")) {
                game();
            }
        }
        System.out.println("You have "+(10-guessnum)+" guesses left");
        System.out.print("Guess: ");
        int guess = sc.nextInt();
        if (guess > num) {
            System.out.println("TOO HIGH");
            guessnum++;
            guess(num,guessnum);
        }else if (guess < num) {
            System.out.println("TOO LOW");
            guessnum++;
            guess(num,guessnum);
        }else {
            System.out.println("YOU WIN!");
            System.out.println("Play again? [y/n]");
            String playagain = sc.next();
            if (playagain.equals("y")) {
                game();
            }
        }
    }
}
