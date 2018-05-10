package xtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SpaceKings {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Welcome to Space Kings Auto-Deck!");
        System.out.println();
        System.out.println("Generating Shuffled Deck...");
        System.out.println();
        Deck test = new Deck(true,true);
        Collections.shuffle(test.deck);
        prompt(test);
    }

    private static void prompt(Deck test) {
        int success = 0;
        int joker = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cards do you want to draw?");
        System.out.print(">");
        int num = sc.nextInt();
        System.out.println();
        ArrayList<Card> hand = test.draw(num,test);
        for (Card target:hand) {
            String number = Integer.toString(target.val);
            if (target.val > 10 && target.val < 15) {
                success++;
            }
            if (target.val == 15) {
                joker++;
            }
            if(number.equals("11")) {
                number = "Jack";
            }
            if(number.equals("12")) {
                number = "Queen";
            }
            if(number.equals("13")) {
                number = "King";
            }
            if(number.equals("14") || number.equals("0")) {
                number = "Ace";
            }
            if(number.equals("15")) {
                System.out.println("Joker");
            }
            if(!number.equals("Joker")) {
                System.out.println(number + " of " + target.suit);
            }
        }
        System.out.println();
        System.out.print(success + " success  ");
        if(joker>0) {
            System.out.print(joker + " joker");
        }
        System.out.println();
        System.out.println();
        prompt(test);
    }
}
