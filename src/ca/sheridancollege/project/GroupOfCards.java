/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * Singleton class to ensure only one deck is made and used.
 *
 * @author dancye, Ian Ibrahim, Kris Zwolinski
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private static ArrayList<Card> cards;
    static{
        GroupOfCards deck = new GroupOfCards();
    }

    //Creating all unique cards in one deck. Shuffling after.
    private GroupOfCards() {

        this.cards = new ArrayList();
        for (Card.Suit s : Card.Suit.values()) {
            for (Card.Rank r : Card.Rank.values()) {
                cards.add((new Card(r, s)));

            }
        }

        Collections.shuffle(cards);

    }

    /**
     * 
     * @return GroupOfCards ArrayList to be used for game.
     */
    public static ArrayList<Card> getInstance() {
        return GroupOfCards.cards;
    }

}//end class
