package xtra;

import java.util.Collections;

public class DeckTest {
    public static void main(String[] args) {
        Deck test = new Deck(true,true);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        Collections.shuffle(test.deck);
        test.draw(60,test);
        System.out.println();
        for (Card check : test.deck) {
            System.out.println(test.getCard(check));
        }

    }

}
