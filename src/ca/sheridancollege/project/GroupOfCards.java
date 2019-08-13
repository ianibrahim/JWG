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
public class GroupOfCards
{

   //The group of cards, stored in an ArrayList
   private static ArrayList<Card> cards;

   private static final GroupOfCards dOC;

   static {
      dOC = new GroupOfCards(52);
   }

   private GroupOfCards (int givenSize)
   {


      this.cards = new ArrayList();
      for (int i = 0; i < givenSize; i++) {
         for (Card.Rank r : Card.Rank.values()) {
            for (Card.Suit s : Card.Suit.values()) {
               cards.add((new Card(r, s)));
            }
         }
      }
      Collections.shuffle(cards);
   }

   public static ArrayList<Card> getInstance ()
   {
      return dOC.cards;
   }



}//end class