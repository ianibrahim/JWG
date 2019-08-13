/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * General card class that emulates cards in a deck.
 *
 * @author dancye, 2018, Ian Ibrahim, Kris Zwolinski
 */
public class Card
{
   //enum Rank holds all possible ranks for play cards
   public enum Rank
   {
      ACE,
      TWO,
      THREE,
      FOUR,
      FIVE,
      SIX,
      SEVEN,
      EIGHT,
      NINE,
      TEN,
      JACK,
      QUEEN,
      KING;
   }

   //enum Suit holds the 4 known card types 
   public enum Suit
   {
      CLUBS,
      SPADES,
      HEARTS,
      DIAMONDS;
   }
   //default modifier for child classes
   private final Rank rank;
   private final Suit suit;

//Card class receives a rank and suit
   public Card (Rank rank, Suit suit)
   {
      this.rank = rank;
      this.suit = suit;

   }

   /**
    * All card ranks have their own value.
    * 
    * @return int value associated with the rank of the card.
    */
   public int cardValue ()
   {
      int trueValue = 0;
      switch (this.rank) {
         case ACE:
            trueValue = 14;
            break;

         case TWO:
            trueValue = 2;
            break;
         case THREE:
            trueValue = 3;
            break;
         case FOUR:
            trueValue = 4;
            break;
         case FIVE:
            trueValue = 5;
            break;
         case SIX:
            trueValue = 6;
            break;
         case SEVEN:
            trueValue = 7;
            break;
         case EIGHT:
            trueValue = 8;
            break;
         case NINE:
            trueValue = 9;
            break;
         case TEN:
            trueValue = 10;
            break;
         case JACK:
            trueValue = 11;
            break;
         case QUEEN:
            trueValue = 12;
            break;
         case KING:
            trueValue = 13;
            break;

      }
      return trueValue;
   }

   /**
    * @return a String representation of a war game card.
    * 
    */
   @Override
   public String toString ()
   {
      String temp;
      temp = " " + this.rank + " of " + this.suit;
      return temp;
   }

}
