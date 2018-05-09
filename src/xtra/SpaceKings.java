package xtra;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cards do you want to draw?");
        System.out.print("> ");
        int num = sc.nextInt();
        System.out.println();
        test.draw(num,test);
        System.out.println();
        prompt(test);
    }
}
