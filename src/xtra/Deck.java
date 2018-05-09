package xtra;

import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    public Deck(Boolean acehigh,Boolean jokers) {
        String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
        for (String suit : suits) {
            for(int x = 2;x<15;x++) {
                if (x == 14 && !acehigh) {
                    Card nu = new Card(suit,0);
                    deck.add(nu);
                }
                else {
                    Card nu = new Card(suit,x);
                    deck.add(nu);
                }
            }
        }
        if (jokers) {
            Card joker = new Card("Joker",15);
            deck.add(joker);
            deck.add(joker);
        }
    }

    public String getVal(Card check) {
        if(check.val == 11) {
            return "Jack";
        }
        if(check.val == 12) {
            return "Queen";
        }
        if(check.val == 13) {
            return "King";
        }
        if(check.val == 14 || check.val == 0) {
            return "Ace";
        }
        if(check.val == 15) {
            return "Joker";
        }
        else {
            return Integer.toString(check.val);
        }
    }

    public String getCard(Card check) {
        if(check.suit.equals("Joker")) {
            return "Joker";
        }
        return (getVal(check) + " of " + check.suit);
    }

    public ArrayList<Card> draw(int num, Deck target) {
        ArrayList<Card> hand = new ArrayList<>();
        if (target.deck.size()<num) {
            System.out.println("Not enough cards, Please re-shuffle");
        }else {
            for (int x = 0; x < num; x++) {
                hand.add(target.deck.get(0));
                target.deck.remove(0);
            }
            return hand;
        }
        return null;
    }
}
