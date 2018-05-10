package xtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HoldEm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deck texas = new Deck(true,false);
        Collections.shuffle(texas.deck);
        ArrayList<Card> p1hand = texas.draw(5,texas);
        ArrayList<Card> p2hand = texas.draw(5,texas);
        System.out.println();
        System.out.println("Your Hand:");
        for (Card look : p1hand) {
            System.out.println(texas.getCard(look));
        }
        System.out.println();
        System.out.println("Their Hand:");
        for (Card look : p2hand) {
            System.out.println(texas.getCard(look));
        }
        System.out.println();
        int p1Hval = highCard(p1hand);
        int p2Hval = highCard(p2hand);
        String p1H = texas.getCardByVal(p1Hval);
        String p2H = texas.getCardByVal(p2Hval);
        int p1 = river(p1hand);
        int p2 = river(p2hand);

    }

    public static int highCard(ArrayList<Card> hand) {
        ArrayList<Integer> vals = new ArrayList<>();
        for (Card check : hand) {
            vals.add(check.val);
        }
        return Collections.max(vals);
    }

    public static int river(ArrayList<Card> hand) {
        Boolean royal = false;
        Boolean sFlush = false;
        Boolean fourK = false;
        Boolean fHouse = false;
        Boolean flush = false;
        Boolean straight = false;
        Boolean threeK = false;
        Boolean twoP = false;
        Boolean pair = false;

        ArrayList<Integer> vals = new ArrayList<>();
        for (Card check : hand) {
            vals.add(check.val);
        }
        Collections.sort(vals);

        ArrayList<String> suits = new ArrayList<>();
        for (Card check : hand) {
            suits.add(check.suit);
        }

//        ArrayList<String> test = new ArrayList<>();
//        test.add("spades");
//        test.add("spades");
//        test.add("spades");

        Boolean seq = sequence(vals);
        Boolean suit = suits(suits);
//        int pairs = paired(vals);

        return 1;
    }

//    public static int paired(ArrayList<Integer> vals) {
//
//    }

    public static Boolean sequence(ArrayList<Integer> vals) {
        boolean result = true;
        int beg = vals.get(0);
        for (int x = 1;x<vals.size();x++) {
            if (vals.get(x) == beg+1) {
                beg = vals.get(x);
            }else {
                result = false;
                break;
            }
        }
        return result;

    }

    public static Boolean suits(ArrayList<String> suits) {
        boolean result = true;
        String beg = suits.get(0);
        for (int x = 1;x<suits.size();x++) {
            if (suits.get(x).equals(beg)) {
                continue;
            }else {
                result = false;
                break;
            }
        }
        return result;
    }



    public static void result(int p1,int p2) {

    }
}
