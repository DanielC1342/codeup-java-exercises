package xtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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

        result(p1,p1Hval,p1H,p2,p2Hval,p2H);

    }

    public static int highCard(ArrayList<Card> hand) {
        ArrayList<Integer> vals = new ArrayList<>();
        for (Card check : hand) {
            vals.add(check.val);
        }
        return Collections.max(vals);
    }

    public static int river(ArrayList<Card> hand) {
//        Boolean royal = false;
//        Boolean sFlush = false;
//        Boolean fourK = false;
//        Boolean fHouse = false;
//        Boolean flush = false;
//        Boolean straight = false;
//        Boolean threeK = false;
//        Boolean twoP = false;
//        Boolean pair = false;

        ArrayList<Integer> vals = new ArrayList<>();
        for (Card check : hand) {
            vals.add(check.val);
        }
        Collections.sort(vals);

        ArrayList<String> suits = new ArrayList<>();
        for (Card check : hand) {
            suits.add(check.suit);
        }

//        ArrayList<Integer> test = new ArrayList<>();
//        test.add(10);
//        test.add(11);
//        test.add(12);
//        test.add(13);
//        test.add(14);
        ArrayList<Integer> royale = new ArrayList<>();
        royale.add(10);
        royale.add(11);
        royale.add(12);
        royale.add(13);
        royale.add(14);
        Boolean seq = sequence(vals);
        Boolean suit = suits(suits);
        int pairs = paired(vals); // 0 is no pairs, 1 is pair, 2 is two pair, 3 is three of a kind, 4 is four of a kind, 5 is Full House
        if (vals.equals(royale) && suit) {
            return 10; //Royal Flush
        }
        if (seq && suit) {
            return 9; //Straight Flush
        }
        if (pairs == 4) {
            return 8; //4 of a Kind
        }
        if (pairs == 5) {
            return 7; //Full House
        }
        if (suit) {
            return 6; //Flush
        }
        if (seq) {
            return 5; //Straight
        }
        if (pairs == 3) {
            return 4; //3 of a Kind
        }
        if (pairs == 2) {
            return 3; //2 Pair
        }
        if (pairs == 1) {
            return 2; //Pair
        }
        return 1; //High Card
    }

    public static int paired(ArrayList<Integer> vals) {
        HashMap<Integer,Integer> pearz = new HashMap<>();
        for (int check : vals) {
            if (pearz.containsKey(check)) {
                int up = pearz.get(check)+1;
                pearz.replace(check,up);
            }else {
                pearz.putIfAbsent(check, 1);
            }
        }
        Boolean p3 = pearz.containsValue(3);
        Boolean p2 = pearz.containsValue(2);
        if (pearz.containsValue(4)) {
            return 4;
        }
        if (p3 && p2) {
            return 5;
        }
        if (p3) {
            return 3;
        }
        if (p2) {
            int freq = Collections.frequency(pearz.values(), 2);
            if (freq == 2) {
                return 2;
            }else {
                return 1;
            }
        }
        return 0;
    }

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



    public static void result(int p1,int p1Hval,String p1H,int p2,int p2Hval,String p2H) {
        if (p1 == p2) {
            if (p1Hval > p2Hval) {
                System.out.println("You Win");
                System.out.println(p1H+" High");
            }
            if (p1Hval < p2Hval) {
                System.out.println("They Win");
                System.out.println(p2H+" High");
            }
        }
        else {
            int winner;
            String winH;
            if (p1>p2) {
                System.out.println("You Win");
                winner = p1;
                winH = p1H;
            }
            else {
                System.out.println("They Win");
                winner = p2;
                winH = p2H;
            }

            if (winner == 10) {
                System.out.println("Royal Flush");
            }
            if (winner == 9) {
                System.out.println("Straight Flush");
            }
            if (winner == 8) {
                System.out.println("4 of a Kind");
            }
            if (winner == 7) {
                System.out.println("Full House");
            }
            if (winner == 6) {
                System.out.println("Flush");
            }
            if (winner == 5) {
                System.out.println("Straight");
            }
            if (winner == 4) {
                System.out.println("3 of a Kind");
            }
            if (winner == 3) {
                System.out.println("2 Pair");
            }
            if (winner == 2) {
                System.out.println("Pair");
            }
        }
    }
}
