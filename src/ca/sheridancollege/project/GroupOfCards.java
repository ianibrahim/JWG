/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private static ArrayList<Card> cards;
    static{
        GroupOfCards deck = new GroupOfCards();
    }

    private GroupOfCards() {

        this.cards = new ArrayList();
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Rank r : Card.Rank.values()) {
                cards.add((new Card(r, s)));

            }
        }

        Collections.shuffle(cards);

    }

    public static ArrayList<Card> getInstance() {
        return GroupOfCards.cards;
    }

}//end class
