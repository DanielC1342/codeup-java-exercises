package xtra;

public class Card {
    String suit;
    int val;

    public Card(String suit, int value) {
        this.suit = suit;
        val = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setVal(int val) {
        this.val = val;
    }

}
